package udb.sv.tallerpractico01.model

class Empleado(nombre: String, salarioBase: Double) {
    var nombre: String = nombre
    var salarioBase: Double = salarioBase

    fun calcularSalarioNeto(): Double {
        val ISSS = salarioBase * 0.03
        val AFP = salarioBase * 0.04
        val RENTA = salarioBase * 0.05
        val deducciones = ISSS + AFP + RENTA
        return salarioBase - deducciones
    }
}