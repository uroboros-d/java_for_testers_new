package model;

public record Group(String name, String header, String footer) {

    public Group() {
        //создаем объект с пустыми полями, вызывая конструктор, который создается в record по дефолту
        this("","","");
    }

    public Group withName(String name) {
        //вернуть объект с другим именем, а хэдер и футер такие же как у существующего объекта
        return new Group(name, this.header, this.footer);
    }

    public Group withHeader(String header) {
        //вернуть объект с другим именем, а хэдер и футер такие же как у существующего объекта
        return new Group(this.name, header, this.footer);
    }

    public Group withFooter(String footer) {
        //вернуть объект с другим именем, а хэдер и футер такие же как у существующего объекта
        return new Group(this.name, this.header, footer);
    }
}