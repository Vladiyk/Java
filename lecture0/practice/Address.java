package lecture0.practice;

public class Address {
/*
Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.
 */
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(int index, String country, String city, String street, int house, int apartment) {
        this.index = 128429424;
        this.country = "Slovakia";
        this.city = "Lipt.Mikulash";
        this.street = "Aurel Stodola";
        this.house = 1863;
        this.apartment = 45;
    }
}
