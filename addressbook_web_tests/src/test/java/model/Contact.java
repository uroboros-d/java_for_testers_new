package model;

public record Contact(String firstName, String lastName, String address) {

    public Contact() {
        //создаем объект с пустыми полями, вызывая конструктор, который создается в record по дефолту
        this("","","");
    }

    public Contact withFirstName(String firstName) {
        //вернуть объект с другим именем, а хэдер и футер такие же как у существующего объекта
        return new Contact(firstName, this.lastName, this.address);
    }

    public Contact withLastName(String lastName) {
        //вернуть объект с другим хэдером, а имя и футер такие же как у существующего объекта
        return new Contact(this.firstName, lastName, this.address);
    }

    public Contact withAddress(String address) {
        //вернуть объект с другим футером, а имя и хэдер такие же как у существующего объекта
        return new Contact(this.firstName, this.lastName, address);
    }
}
