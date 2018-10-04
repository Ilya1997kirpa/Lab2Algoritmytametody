package khai.lab2

class Implementor: LogicFindMedian, IterationLess3K, ArrayFirstLess {
    override fun first_less(A: Array<Double>, T: Double) {
        val i: Int=0
        for (i in 0..8) {
            if (A[i] < T) {
                println("${(A[i])}")
                break;
            }
            else if (A[i] > T) {
                A[i]
                continue;
            }
            else if  (A[9] > T) {

                println("Нет чисел меньше заданого ")
            }


            break;
        }

    }
    override fun find_median(a: Double, b: Double, c: Double): Double {
        if (a > b && a > c) {
            when {
                b > c -> println("Среднее значение =  ${b}")
                else -> println("Среднее значение =  ${c}")
            }

        }
        else if (a < b && b > c) {
            when {
                a > c -> println("Среднее значение =  ${a}")
                else -> println("Среднее значение =  ${c}")
            }
        } else {
            when {
                a > b -> println("Среднее значение =  ${a}")
                else -> println("Среднее значение =  ${b}")
            }
        }
        return 0.0;
    }

    override fun less_3k(N: Int) {
        var k: Int = 0
        while (3*k <= N) {
            k++
        }
        println("Наименьшее значение К = ${k-1}")
    }
}
fun main(args: Array<String>) {
    println("Lab 2.")
    println("LogicFindMedian")
    val C: LogicFindMedian = Implementor()
    println(C.find_median(3.0, 3.5, 3.2))
    println("IterationLess3K")
    val D: IterationLess3K = Implementor()
    D.less_3k(12)
    println("ArrayFirstLess")
    val E: ArrayFirstLess = Implementor()
    E.first_less(arrayOf(21.0, 6.0, -7.0, 8.0, 23.0, 7.0, 12.0, 0.0, -5.0, 17.0),-7.0)

}
