class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        List<List<Integer>> skill_people = new ArrayList<>();
        for(int i=0; i<req_skills.length; i++){
            skill_people.add(new ArrayList<>());
        }

        for(int i=0; i<req_skills.length; i++)
        {
            String s = req_skills[i];
            for(int j=0; j<people.size(); j++){
                for(String skill: people.get(j)){
                    if(s.equals(skill)) skill_people.get(i).add(j);
                }
            }
        }

        Collections.sort(skill_people, (p1, p2)->p1.size()-p2.size());

        Set<Integer> team = new HashSet<>();
        boolean[] visited = new boolean[skill_people.size()];
        int i=0;
        for(List<Integer> p: skill_people){
            if(p.size() == 1){
                team.add(p.get(0));
                visited[i] = true;
            }
            else{
                for(int j: p){
                    if(team.contains(j)){
                        visited[i] = true;
                        break;
                    }
                }
            }
            i += 1;
        }

        List<List<Integer>> skill_people2 = new ArrayList<>();

        for(i=0; i<skill_people.size(); i++){
            if(visited[i]) continue;
            skill_people2.add(skill_people.get(i));
        }

        if(skill_people2.size() == 0) return new ArrayList<>(team).stream().mapToInt(j->j).toArray();

        Set<Integer> temp = util(0, skill_people2, new HashSet<>());
        List<Integer> ans = new ArrayList<>(temp);
        for(int t: team){
            ans.add(t);
        }

        return new ArrayList<>(ans).stream().mapToInt(j->j).toArray();
    }

    public Set<Integer> util(int i, List<List<Integer>> skill_people, Set<Integer> team)
    {
        if(i == skill_people.size()) return team;

        for(int p: skill_people.get(i)){
            if(team.contains(p)){
                return util(i+1, skill_people, team);
            }
        }

        int ans_size = 100;
        Set<Integer> ans = null;

        for(int p: skill_people.get(i)){
            team.add(p);
            Set<Integer> temp = util(i+1, skill_people, team);
            if(temp.size() < ans_size){
                ans_size = temp.size();
                ans = new HashSet<>(temp);
            }
            team.remove(p);
        }

        return ans;
    }
}
