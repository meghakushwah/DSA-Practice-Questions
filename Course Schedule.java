class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         boolean [] visited = new boolean[prerequisites.length];
        int [] incoming = new int[numCourses];

        for (int [] course : prerequisites)
        {
            incoming[course[1]]++;
        }

        boolean flag = true;

        while (flag)
        {
            flag = false;
            for (int i = 0; i < prerequisites.length; i++)
            {
                if (!visited[i])
                {
                    if (incoming[prerequisites[i][0]] == 0)
                    {
                        incoming[prerequisites[i][1]]--;
                        visited[i] = true;
                        flag = true;
                    }
                }
            }
        }
        for (int i : incoming)
        {
            if (i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
