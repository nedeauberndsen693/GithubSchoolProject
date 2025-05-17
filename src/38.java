class SimpleGithubProject {
    private String name;
    private int age;

    public SimpleGithubProject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleGithubProject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
