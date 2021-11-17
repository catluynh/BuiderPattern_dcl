package BuilderPattern;

public class TestBuilderPattern {
    public static void main(String[] args) {
//Using builder to get the object in a single line of code and
//without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        Student student = new Student.StudentBuilder(18087531, "luynh", "dhktpm", 22, "nam")
                .setNationality("viet nam").setAddress("daklak").build();

        Student student1 = new Student.StudentBuilder(18087531, "duong cat luynh", "dhktpm", 22, "nam").build();

        System.out.println(comp);
        System.out.println(student);
        System.out.println(student1);
    }
}
