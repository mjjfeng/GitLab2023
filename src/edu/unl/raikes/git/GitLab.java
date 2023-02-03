package edu.unl.raikes.git;

public class GitLab {
    
    public GitLab() {
        
    }
    
    public static void main(String[] args) {
        GitLabHelper helper = new GitLabHelper("Victoria", "Josh");
        helper.PrintWelcomeMessage();    }
}
