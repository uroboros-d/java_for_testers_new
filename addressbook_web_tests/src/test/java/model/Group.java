package model;

public record Group(String id, String name, String header, String footer) {

    public Group() {
        //создаем объект с пустыми полями, вызывая конструктор, который создается в record по дефолту
        this("","","","");
    }

    public Group withId(String id) {
        //вернуть объект с другим id, а имя, хэдер и футер такие же как у существующего объекта
        return new Group(id, this.name, this.header, this.footer);
    }

    public Group withName(String name) {
        //вернуть объект с другим именем, а хэдер и футер такие же как у существующего объекта
        return new Group(this.id, name, this.header, this.footer);
    }

    public Group withHeader(String header) {
        //вернуть объект с другим хэдером, а имя и футер такие же как у существующего объекта
        return new Group(this.id, this.name, header, this.footer);
    }

    public Group withFooter(String footer) {
        //вернуть объект с другим футером, а имя и хэдер такие же как у существующего объекта
        return new Group(this.id, this.name, this.header, footer);
    }
}