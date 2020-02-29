package com.kveola.intermediate.EasyJackson;

public class Tags {
    private boolean doomed;
    private boolean unique;
    private String deploy;

    public Tags(boolean doomed, boolean unique, String deploy) {
        this.doomed = doomed;
        this.unique = unique;
        this.deploy = deploy;
    }

    public boolean isDoomed() {
        return doomed;
    }

    public void setDoomed(boolean doomed) {
        this.doomed = doomed;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public String getDeploy() {
        return deploy;
    }

    public void setDeploy(String deploy) {
        this.deploy = deploy;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "doomed=" + doomed +
                ", unique=" + unique +
                ", deploy='" + deploy + '\'' +
                '}';
    }
}
