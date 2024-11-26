package collection;

public class Student {

    private Integer mathMarks;
    private Integer physicsMarks;
    private Integer chemistryMarks;
    private Integer englishMarks;
    private Integer hindiMarks;
    private String name;

    public Student(Integer mathMarks, Integer physicsMarks, Integer chemistryMarks, Integer englishMarks, Integer hindiMarks, String name) {
        this.mathMarks = mathMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.englishMarks = englishMarks;
        this.hindiMarks = hindiMarks;
        this.name = name;
    }

    public Integer getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(Integer mathMarks) {
        this.mathMarks = mathMarks;
    }

    public Integer getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(Integer physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public Integer getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(Integer chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public Integer getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(Integer englishMarks) {
        this.englishMarks = englishMarks;
    }

    public Integer getHindiMarks() {
        return hindiMarks;
    }

    public void setHindiMarks(Integer hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer sumOfMarks(){
        return this.getMathMarks() + this.getPhysicsMarks() + this.getChemistryMarks() + this.getHindiMarks() + this.getEnglishMarks();
    }

    @Override
    public String toString() {
        return "Student{" +
                "mathMarks=" + mathMarks +
                ", physicsMarks=" + physicsMarks +
                ", chemistryMarks=" + chemistryMarks +
                ", englishMarks=" + englishMarks +
                ", hindiMarks=" + hindiMarks +
                ", name='" + name + '\'' +
                '}';
    }
}
