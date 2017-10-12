package wiki.conoha.javahomework.set;

public class Cat {
    private String name;
    private int age;
    private String species;

    public Cat(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 品种='" + species + '\'';
    }

    @Override
    public boolean equals(Object o) {
        //判断对象是否相等，相等返回true，就不用比较属性了
        if (this == o) return true;
        //判断形参是否是Cat类
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        return species != null ? species.equals(cat.species) : cat.species == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (species != null ? species.hashCode() : 0);
        return result;
    }
}
