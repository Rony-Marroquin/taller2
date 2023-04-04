package udb.sv.tallerpractico01.controller

import udb.sv.tallerpractico01.model.Empleado

class EmpleadoController {
    fun calcularSalarioNeto(nombre: String, salarioBase: Double): Double {
        val empleado = Empleado(nombre, salarioBase)
        return empleado.calcularSalarioNeto()
    }
}