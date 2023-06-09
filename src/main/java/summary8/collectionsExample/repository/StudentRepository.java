package summary8.collectionsExample.repository;

import summary8.collectionsExample.entity.Student;

import java.util.*;

public class StudentRepository implements Repository{

    private Integer id = 0;

    private List<Student> database = new ArrayList<>();

    /*
    Исходник наших данных - это либо информация от пользователя,
    либо данные из базы данных

    если мы получаем данные от пользователя, то знаем все поля Student

    но у нас нет id - потому что в базе данных еще нет такой записи
    поэтому id будет присвоен автоматически при добавлении нового студента в коллекцию

    если читаем(получаем) из базы данных - то строка базы данных содержит
    и все данные о студенте и id - порядковый номер записи в таблице базы данных

    поэтому мы можем "синхронизировать" порядок строк из базы данных и последовательность
    элементов нашей коллекции по этому id, то есть номер элемента коллекции должен
    быть равен порядковому номеру (id) записи из таблицы базы данных

     */

    /*
    List<Student> database = new ArrayList<>();

    List<Student> database = new LinkedList<>();

    Set<Student> database = new HashSet<>();

    Map<id, Student> database = new HashMap<>();

    Map<String = "Town", List<Student>> studentsFromTown = new TreeMap

     */

    /*
          Рассмотри вариант LIST
    В момент создания первоначальной коллекции

    List
    id 1 - Student (1, name1, discr1)
    id 2 - Student (2, name2, discr2)
    id 3 - Student (3, name3, discr3)
    id 4 - Student (4, name4, discr4)
    id 5 - Student (5, name5, discr5)

    Но потом мы можем менять наши данные

    id 1 - Student (1, name1, discr1)

    id 2 - Student (3, name3, discr3)

    id 3 - Student (5, name5, discr5)

    ? на сколько удобна такая структура данных ???

     */

      /*
      Рассмотри вариант MAP
    В момент создания первоначальной коллекции

    Map
    id 1 = Student (1, name1, discr1)
    id 2 = Student (2, name2, discr2)
    id 3 = Student (3, name3, discr3)
    id 4 = Student (4, name4, discr4)
    id 5 = Student (5, name5, discr5)

    Но потом мы можем менять наши данные

    id 1 = Student (1, name1, discr1)

    id 3 = Student (3, name3, discr3)

    id 5 = Student (5, name5, discr5)

    ? на сколько удобна такая структура данных ???

     */


    @Override
    public void add(Student student) {

    }

    @Override
    public void findAll() {

    }
}
