package edu.unl.raikes.git;

public class GitLab {
    
    public GitLab() {
        
    }
    
    /**
     * original code :)
     */
    public static void main(String[] args) {
        GitLabHelper helper = new GitLabHelper(new String[] { "Victoria", "Joshua"});
        helper.PrintWelcomeMessage();
    }
}
