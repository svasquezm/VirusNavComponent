package cl.svasquezm.virusnavcomponent.data

data class Virus(val id: String, val type: VirusType, val name: String, val description: String)

enum class VirusType {
    RSP,
    EST,
    SEX,
    SEC,
    INS
}
