fun main() {
    Choise().vibor()
}

class Choise {
    fun vibor() {
        var choice: Int

        do {
            println("Выберите задачу:")
            println("1. Среднее арифметическое трех чисел")
            println("2. Проверка на символ")
            println("3. Вычисление Unicode")
            println("4. Вычисление Unicode с нижнего регистра")
            println("5. Объеденение 5 строк")
            println("6. Переместить 2 элемента строки в конец")
            println("7. Проверка на строку")
            println("8. Проверка на совершеннолетие")
            println("9. Четное не четное")
            println("10. Категория возвраста")
            println("11. Число = день недели")
            println("12. Удвоенные число от 1 до n")
            println("13. Таймер")
            println("14. Массив с числами")
            println("15.")
            println("16.")
            println("17.")
            println("18.")
            println("19. MapOf с днями недели")
            println("20.")


            println("0. Выход")

            choice = readLine()!!.toInt()

            when (choice) {
                1 -> AverageCalculator().calculate()
                2 -> IsLetter().letter()
                3 -> Unicode().unicode()
                4 -> UpDownUnicode().upDownUnicode()
                5 -> FiveStrings().fiveStrings()
                6 -> CharInEnd().charInEnd()
                7 -> IsLenght().isLenght()
                8 -> IsAdult().isAdult()
                9 -> ChetNeChet().chetNeChet()
                10 -> AgeDistans().ageDistans()
                11 -> DayOfWeek().dayOfWeek()
                12 -> DoubleTwo().doubleTwo()
                13 -> Timer().timer()
                14 -> MassiveNums().massiveNums()
                19 -> MapOfWeek().MapOfWeek()
                0 -> println("Выход из программы...")
                else -> println("Некорректный выбор. Попробуйте еще раз.")
            }
        } while (choice != 0)
    }
}

class AverageCalculator {
    fun calculate() {
        println("Введите первое число:")
        val num1 = readLine()!!.toDouble()

        println("Введите второе число:")
        val num2 = readLine()!!.toDouble()

        println("Введите третье число:")
        val num3 = readLine()!!.toDouble()

        val average = (num1 + num2 + num3) / 3

        println("Среднее арифметическое: $average")
    }
} //1

class IsLetter {
    fun letter() {
        println("Введите символ:")
        val input = readLine()!!

        val isLetter = input.length == 1 && input[0].isLetter()

        println("Является ли введенный символ буквой: $isLetter")
    }
} //2

class Unicode {
    fun unicode() {
        println("Введите первый символ:")
        val char1 = readLine()!![0]

        println("Введите второй символ:")
        val char2 = readLine()!![0]

        val diff = char1 - char2

        println("Разность в Unicode: $diff")
    }
} //3

class UpDownUnicode {
    fun upDownUnicode() {
        println("Введите символ в нижнем регистре:")
        val char = readLine()!![0]

        val upperCaseChar = char.toUpperCase()
        val unicode = upperCaseChar.toInt()

        println("Символ в верхнем регистре: $upperCaseChar")
        println("Код Unicode: $unicode")
    }
} //4

class FiveStrings {
    fun fiveStrings() {
        val strings = mutableListOf<String>()

        for (i in 1..5) {
            println("Введите строку $i:")
            val input = readLine()!!
            strings.add(input)
        }

        val result = strings.joinToString("")

        println("Объединенные строки: $result")
    }
} //5

class CharInEnd {
    fun charInEnd() {
        println("Введите строку:")
        val input = readLine()!!

        if (input.length >= 2) {
            val firstTwoChars = input.substring(0, 2)
            val remainingChars = input.substring(2)
            val result = remainingChars + firstTwoChars

            println("Результат: $result")
        } else {
            println("Строка должна содержать не менее двух символов.")
        }
    }
} //6

class IsLenght {
    fun isLenght() {
        println("Введите строку:")
        val input: String? = readLine()

        val length = input?.length

        if (length != null) {
            println("Длина строки: $length")
        } else {
            println("Вы ввели пустую строку.")
        }
    }
} //7

class IsAdult {
    fun isAdult(){
        println("Введите возраст:")
        val age = readLine()!!.toInt()

        if (age >= 18) {
            println("Совершеннолетний")
        } else if (age >= 0) {
            println("Несовершеннолетний")
        } else {
            println("Введено некорректное значение")
        }
    }
} //8

class ChetNeChet {
    fun chetNeChet() {
        println("Введите число:")
        val number = readLine()!!.toInt()

        if (number % 2 == 0) {
            println("Четное число")
        } else {
            println("Нечетное число")
        }
    }
} //9

class AgeDistans {
    fun ageDistans() {
        println("Введите возраст:")
        val age = readLine()!!.toInt()

        when (age) {
            in 0..12 -> println("Ребенок")
            in 13..17 -> println("Подросток")
            in 18..64 -> println("Взрослый")
            in 65..Int.MAX_VALUE -> println("Пожилой")
            else -> println("Некорректный возраст")
        }
    }
} //10

class DayOfWeek {
    fun dayOfWeek() {
        println("Введите число от 1 до 7:")
        val number = readLine()!!.toInt()

        when (number) {
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("Некорректное число")
        }
    }
} //11

class DoubleTwo {
    fun doubleTwo() {
        println("Введите число:")
        val n = readLine()!!.toInt()

        for (i in 2 until n step 2) {
            println(i)
        }
    }
} //12

class Timer {
    fun timer() {
        println("Введите число:")
        val input = readLine()

        if (input != null && input.toIntOrNull() != null && input.toInt() > 0) {
            val countdown = input.toInt()
            for (i in countdown downTo 1) {
                println(i)
                Thread.sleep(1000)
            }
            println("Эщкере!!!!!")
        } else {
            println("Некорректный ввод.")
        }
    }
} // 13

class MassiveNums{
    fun massiveNums() {

    }
} //14

class MapOfWeek{
    fun MapOfWeek() {
        val daysOfWeek = mapOf(
            "Понедельник" to 1,
            "Вторник" to 2,
            "Среда" to 3,
            "Четверг" to 4,
            "Пятница" to 5,
            "Суббота" to 6,
            "Воскресенье" to 7
        )

        println(daysOfWeek)
    }
} // 19

