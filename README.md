# Автоматизация задач отдела продаж.

## Написание инструмента статистики продаж.

Данная программа является одним из компонентов автоматизации
задач отдела продаж. Первая ееё версия работает с готовыми данными
и является демонстратором. Состоит из двух блоков:

### блок 1:

```html
public class Main {

    public static void main(String[] args) {
        int[] sales = {1, 10, 20, 50, 80};
        SalesManager salesmanager = new SalesManager(sales);
        System.out.println(salesmanager.max());
    }
}
```

### блок 2:

```html
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
```

Программа оценивает массив продаж по временным
отрезками и выдаёт максимальное число продаж.

В данной строке класса **Main** подставляется массив данных:

```html
int[] sales = {1, 10, 20, 50, 80};
```

После чего данная строка выводит результат:

```html
System.out.println(salesmanager.max());
```

Скачать и наблюдать за эволюцией проекта можно на 
[Github](https://github.com/Aviator46/projects-of-netology.git)