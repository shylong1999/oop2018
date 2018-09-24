package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Teacher{
    private String name,faculty,sex;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public Teacher(String name, int age, String faculty, String sex){
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.sex = sex;
    }

    public boolean sameFaculty(Teacher t1, Teacher t2){
        return t1.getFaculty().equals(t2.getFaculty());
    }

    public void isTeen(){
        if (this.age >= 18 && this.age <=30) System.out.println("Giảng viên trẻ");
    }

    public void isSex(){
        if (this.sex.equals("male")) System.out.println(this.name + " là giảng viên nam");
        else if (this.sex.equals("female")) System.out.println(this.name + " là giảng viên nữ");
    }
}


class Cat{
    private String name,species;
    int price, speed;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public Cat(String name, int price, int speed, String species){
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.species = species;
    }

    public void printInfo(Cat c){
        System.out.println("Tên : " + c.name);
        System.out.println("Chủng loại" + c.species);
    }

    public void PriceofCat(Cat c){
        if (c.price >= 500) System.out.println("Đây là mèo quý với giá là " + c.price + "$" + "\nThuộc loài " + c.species);
        else System.out.println("Mèo thường giá" + c.price);
    }

    public int catRacing(Cat c1, Cat c2){
        if (c1.speed == c2.speed) return 0;
        else if (c1.speed > c2.speed) return 1;
        return -1;
    }

    public void Mew(){
        System.out.println("Meo Meo Meo Meo");
    }
}

class Rectangular{
    private int length, width, height;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    //Hình hộp chữ nhật
    public Rectangular(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //diện tích toàn phần
    public int TotalArea(){
        int Stp;
        Stp = 2*(length*width + length*height + width*height);
        return Stp;
    }
    //diện tích xung quanh
    public int AroundArea(){
        int Sxq;
        Sxq = 2*(height*length + height*width);
        return Sxq;
    }
    //Thể tích
    public int Volume(){
        int V = height*length*width;
        return V;
    }

    //So sánh thể tích
    public int volumeComparison(Rectangular r1, Rectangular r2){
        int V1 = r1.length*r1.width*r1.height;
        int V2 = r2.length*r2.width*r2.height;
        if (V1 > V2) return 1;
        else if (V1 == V2) return 0;
        return -1;
    }
}
