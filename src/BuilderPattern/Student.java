package BuilderPattern;

public class Student {
    private int id;
    private String name;
    private String className;
    private int age;
    private String gender;

    private String address;
    private String fatherName;
    private String motherName;
    private String nationality;
    private String religion;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getReligion() {
        return religion;
    }

    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.className = builder.className;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.nationality = builder.nationality;
        this.religion = builder.religion;
    }

    public static class StudentBuilder {
        private int id;
        private String name;
        private String className;
        private int age;
        private String gender;

        private String address;
        private String fatherName;
        private String motherName;
        private String nationality;
        private String religion;

        public StudentBuilder(int id, String name, String className, int age, String gender) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.age = age;
            this.gender = gender;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public StudentBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
    @Override
    public String toString() {
        return "StudentBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }
}
