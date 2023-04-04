package udb.sv.tallerpractico01.model

class UsuarioModelo
    (
    private val nota1: Double,
    private val nota2: Double,
    private val nota3: Double,
    private val nota4: Double,
    private val nota5: Double,

    ):IusuarioModelo{
    override fun getNota1(): Double {
        return nota1
    }

    override fun getNota2(): Double {
        TODO("Not yet implemented")

        return nota2
    }

    override fun getNota3(): Double {
        TODO("Not yet implemented")

        return nota3
    }

    override fun getNota4(): Double {
        TODO("Not yet implemented")
        return  nota4
    }

    override fun getNota5(): Double {
        TODO("Not yet implemented")
    }
}