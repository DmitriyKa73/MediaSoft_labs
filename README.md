# MediaSoft Java Labs

Данный репозиторий содержит практические задания, выполненные в рамках учебной практики в компании **ООО "Медиасофт"** (г. Ульяновск).  
Цель — освоение ключевых возможностей Java: работа с классами, коллекциями, лямбда-выражениями, аннотациями, сериализацией и др.

## Содержание

- [Структура репозитория](#структура-репозитория)
- [Описание заданий](#описание-заданий)
  - [Task 1 – Основы Java, массивы и классы](#task-1)
  - [Task 2 – Коллекции и Stream API](#task-2)
  - [Task 3 – Иерархия классов, дженерики, enum, исключения](#task-3)
  - [Task 4 – Лямбды, Predicate, аннотации, JSON](#task-4)
- [Установка и запуск](#установка-и-запуск)
- [Контакты](#контакты)

---

## Структура репозитория

MediaSoft_labs:
- Task 1/ # Массивы, базовые классы, equals/toString/hashCode
- Task 2/ # Коллекции, HashSet, ArrayList, Stream API
- Task 3/ # Иерархия Room, интерфейсы, enum, исключения
- Task 4/ # Лямбда-выражения, функциональные интерфейсы, аннотации, JSON


---

## Описание заданий

### Task 1

**Темы:**
- ООП: классы, методы, поля
- Генерация случайных данных
- Переопределение `equals`, `hashCode`, `toString`
- Работа с массивами и статическими методами

**Что реализовано:**
- Класс `Car` с параметрами
- Массивы объектов
- Фильтрация, сортировка, сравнение
- Демонстрация сгенерированных данных

---

### Task 2

**Темы:**
- Коллекции Java: `ArrayList`, `HashSet`
- Stream API
- Фильтрация и сортировка коллекций

**Что реализовано:**
- Генерация списка автомобилей
- Удаление дубликатов с помощью `HashSet`
- Фильтрация и группировка через `stream().filter()`, `sorted()`, `collect()`

---

### Task 3

**Темы:**
- Абстрактные классы
- Интерфейсы с параметризацией (`RoomService<T>`)
- `enum` для хранения цен
- Исключения (в том числе кастомные)

**Что реализовано:**
- Иерархия классов `Room`: `EconomyRoom`, `LuxRoom` и т.д.
- Интерфейсы `RoomService`, `LuxRoomService`
- Исключение при бронировании занятой комнаты
- Пример использования сервиса бронирования

---

### Task 4

**Темы:**
- Лямбда-выражения (`Printable`, `Predicate`, `Function`, `Consumer`, `Supplier`)
- Пользовательские аннотации: `@DeprecatedEx`, `@JsonField`
- Рефлексия
- Кастомная сериализация в JSON

**Что реализовано:**
- Проверка строк с использованием `Predicate`
- Обработка классов через аннотацию `@DeprecatedEx`
- Сериализация Java-объекта с аннотацией `@JsonField`
- Генерация случайных значений и работы с `Function`

---

## Установка и запуск

### Требования:

- Java JDK 11+
- IntelliJ IDEA (или любая другая Java-IDE)
- Git (опционально)

### Инструкция:

1. Клонировать репозиторий:

```bash
git clone https://github.com/DmitriyKa73/MediaSoft_labs.git
```

Открыть нужное задание в IntelliJ IDEA:

File → Open → Task N

Убедиться, что проект использует JDK 11:

File → Project Structure → Project SDK → JDK 11

Запустить Main.java (если есть):

ПКМ по файлу → Run Main.main()

## Контакты
Автор: Казаров Дмитрий Сергеевич
Студент 2 курса, направление: Java-разработка
Практика: ООО "Медиасофт", г. Ульяновск

