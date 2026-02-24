package model;

public record Contact(String id, String firstName, String lastName, String address) {

    public Contact() {
        //создаем объект с пустыми полями, вызывая конструктор, который создается в record по дефолту
        this("","","","");
    }

    public Contact withId(String id) {
        //вернуть объект с другим id, а имя, хэдер и футер такие же как у существующего объекта
        return new Contact(id, this.firstName, this.lastName, this.address);
    }
    public Contact withFirstName(String firstName) {
        //вернуть объект с другим именем, а id, хэдер и футер такие же как у существующего объекта
        return new Contact(this.id, firstName, this.lastName, this.address);
    }

    public Contact withLastName(String lastName) {
        //вернуть объект с другим хэдером, а id, имя и футер такие же как у существующего объекта
        return new Contact(this.id, this.firstName, lastName, this.address);
    }

    public Contact withAddress(String address) {
        //вернуть объект с другим футером, а id, имя и хэдер такие же как у существующего объекта
        return new Contact(this.id, this.firstName, this.lastName, address);
    }
}
