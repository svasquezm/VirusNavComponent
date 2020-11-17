package cl.svasquezm.virusnavcomponent.data

object VirusDatabase {
    val viruses = listOf(
        Virus(
            id = "000001",
            type = VirusType.RSP,
            name = "Síndrome respiratorio de Oriente Medio (MERS)",
            description = """
                El síndrome respiratorio de oriente medio (MERS, por sus siglas en inglés) es una enfermedad respiratoria grave que involucra principalmente al tracto respiratorio superior. Causa fiebre, tos y dificultad para respirar. Aproximadamente el 30% de las personas que han contraído esta enfermedad han muerto. Algunas personas solo tienen síntomas leves.

                El MERS es causado por el coronavirus del síndrome respiratorio de Oriente Medio (MERS-CoV, por sus siglas en inglés). Los Coronavirus son una familia de virus que pueden causar infecciones respiratorias leves a graves. Se reportó por primera vez en Arabia Saudita en 2012 y luego se propagó a otros países. La mayoría de los casos se propagaron a partir de personas que viajaron a países de Oriente Medio.

                Hasta la fecha, solo ha habido 2 casos de MERS en los Estados Unidos. Fueron en personas que viajaron a los Estados Unidos desde Arabia Saudita y fueron diagnosticados en 2014. El virus presenta un riesgo muy bajo para las personas en los Estados Unidos.
            """.trimIndent()
        ),
        Virus(
            id = "000002",
            type = VirusType.EST,
            name = "Virus respiratorio sincitial",
            description = """
                El virus respiratorio sincitial, también conocido como virus respiratorio sincicial, es una enfermedad viral común. Por lo general, causa síntomas leves parecidos al resfriado. Pero puede provocar infecciones pulmonares graves, especialmente en bebés, adultos mayores y personas con problemas médicos serios.
                
                El virus respiratorio sincitial se transmite de persona a persona a través de:

                El aire al toser y estornudar
                Contacto directo, como besar la cara de un niño con el virus
                Tocar un objeto o superficie con el virus y luego tocarse la boca, la nariz o los ojos antes de lavarse las manos
                En general, las personas con una infección por virus respiratorio sincitial son contagiosas durante 3 a 8 días. Pero a veces los bebés y las personas con sistemas inmunitarios debilitados pueden continuar propagando el virus durante 4 semanas.
            """.trimIndent()
        ),
        Virus(
            id = "000003",
            type = VirusType.SEC,
            name = "Virus del ébola",
            description = """
                La fiebre hemorrágica del Ebola es causada por un virus. Es una enfermedad grave y muchas veces fatal. Puede afectar a humanos y a otros primates. Los investigadores creen que los humanos la contraen a través de un animal infectado. Puede contagiarse de persona a persona por medio de sangre o secreciones.
                
                Los síntomas pueden aparecer entre los dos y los 21 días luego de la exposición al virus. En general, incluyen:

                Fiebre
                Dolor de cabeza
                Dolor en los músculos y articulaciones
                Debilidad
                Diarrea
                Vómitos
                Dolor abdominal
                Falta de apetito
                Otros síntomas incluyen sarpullido, enrojecimiento de los ojos y sangrado interno y externo.

                Los primeros síntomas son similares a los de otras enfermedades comunes. Esto hace difícil diagnosticar a una persona que ha sido infectada por poco tiempo. Sin embargo, si una persona presenta estos síntomas y existe la sospecha de Ebola, el paciente debe ser aislado en cuarentena. También es importante avisar a las autoridades sanitarias. Varios exámenes de laboratorio pueden confirmar el diagnóstico de Ebola.
            """.trimIndent()
        ),
        Virus(
            id = "000004",
            type = VirusType.INS,
            name = "Virus del Nilo Occidental",
            description = """
                El virus del Nilo Occidental es una enfermedad infecciosa que apareció por primera vez en los Estados Unidos en 1999. Mosquitos infectados diseminaron el virus que la causa. Las personas que contraen el virus no suelen tener síntomas o presentan síntomas leves. Los síntomas incluyen fiebre, dolor de cabeza, dolores de cuerpo, erupción cutánea o ganglios linfáticos inflamados.

                Sin embargo, si el virus entra al cerebro puede ser mortal. Puede causar una inflamación del cerebro llamada encefalitis o inflamación del tejido que rodea el cerebro y la médula espinal, llamada meningitis. Un examen físico, su historia clínica y pruebas de laboratorio se utilizan para diagnosticarlo
        
                Las personas mayores y aquellos con sistemas inmunitarios débiles están en mayor riesgo. No existen vacunas o tratamientos específicos para la enfermedad en humanos.
            """.trimIndent()
        ),
        Virus(
            id = "000005",
            type = VirusType.INS,
            name = "Virus del Zika",
            description = """
                El Zika es un virus que en su mayoría se transmite por mosquitos (zancudos). Una mujer embarazada puede pasar el virus a su bebé durante el embarazo o cerca de la fecha de parto. Puede propagarse por contacto sexual. También se ha reportado su diseminación a través de transfusiones de sangre. Han aparecido brotes de Zika en Estados Unidos, África, el sudeste asiático, las islas del Pacífico, algunas áreas del Caribe y en América Central y América del Sur.

                La mayoría de las personas que se contagia el virus no se enferma. Una de cada cinco personas tiene síntomas, que pueden incluir fiebre, erupción en la piel, dolor en las articulaciones y conjuntivitis. En general, los síntomas son leves y comienzan dos a siete días después de haber sido picado por el mosquito.

                Una prueba de sangre puede diagnosticar la infección. No existen vacunas o medicamentos para tratarla. Tomar mucho líquido, descansar y tomar acetaminofén puede ayudar con la recuperación.
            """.trimIndent()
        ),
        Virus(
            id = "000006",
            type = VirusType.SEX,
            name = "Virus del papiloma humano (VPH)",
            description = """
                Los virus del papiloma humano (VPH) son un grupo de virus relacionados entre sí. Pueden causar verrugas en diferentes partes del cuerpo. Existen más de 200 tipos. Cerca de 40 de ellos afectan a los genitales. Estos se propagan a través del contacto sexual con una persona infectada. También se pueden propagar a través de otro contacto íntimo de piel a piel. Algunos de ellos pueden ponerle en riesgo desarrollar un cáncer.

                Existen dos categorías de VPH de transmisión sexual. El VPH de bajo riesgo puede causar verrugas en o alrededor de los genitales, el ano, la boca o la garganta. El VPH de alto riesgo puede causar varios tipos de cáncer:

                Cáncer de cuello uterino
                Cáncer del ano
                Algunos tipos de cáncer de boca y de garganta
                Cáncer de vulva
                Cáncer de vagina
                Cáncer del pene
                La mayoría de las infecciones por VPH desaparecen por sí solas y no causan cáncer. Pero a veces las infecciones duran más. Cuando una infección por VPH de alto riesgo dura muchos años, puede provocar cambios en las células. Si estos cambios no se tratan, pueden empeorar con el tiempo y convertirse en cáncer.
            """.trimIndent()
        ),
        Virus(
            id = "000007",
            type = VirusType.SEX,
            name = "Virus de inmunodeficiencia humana (VIH)",
            description = """
               El virus de inmunodeficiencia humana (VIH) mata o daña las células del sistema inmunitario al destruir los glóbulos blancos que luchan contra las infecciones. El síndrome de inmunodeficiencia adquirida (sida), es el estadio más avanzado de la infección con VIH. No todas las personas con VIH desarrollan sida.

                La infección por el VIH es seria. Pero gracias a mejores tratamientos, las personas con VIH viven ahora más tiempo y tienen una mejor calidad de vida. Si tiene VIH, puede ayudarse a sí mismo si:
                
                Recibe atención médica tan pronto como sepa que tiene VIH
                Encuentra un proveedor de atención médica con experiencia en el tratamiento del VIH y sida
                Si esta con algún medicamento, asegúrese de tomarlo con regularidad
                Busca ayuda a través de grupos de apoyo, terapeutas y organizaciones de servicios sociales
                Aprende todo lo que pueda sobre el VIH y sida y su tratamiento
                Trate de seguir un estilo de vida saludable, como comer alimentos sanos, hacer ejercicio regularmente y dormir lo suficiente
                También es importante reducir el riesgo de propagación del VIH a otras personas. Debe decirles a sus parejas sexuales que usted tiene el VIH, y siempre usar condones.            
            """.trimIndent()
        ),
        Virus(
            id = "000008",
            type = VirusType.EST,
            name = "Virus de coxsackie",
            description = """
                Los virus de coxsackie forman parte de la familia de enterovirus (que también incluye a los virus de la poliomielitis y de la hepatitis A) que viven en el aparato digestivo de los seres humanos.
               
                Los virus se pueden transmitir de persona a persona, generalmente por no lavarse las manos y por las superficies contaminadas con excremento (caca), donde pueden vivir durante varios días.
                
                En la mayoría de los casos, las infecciones por el virus de coxsackie provocan síntomas gripales y desaparecen sin tratamiento. Pero en algunos casos, pueden provocar infecciones más graves.
                
                Los síntomas del virus de coxsackie pueden ser variados. Aproximadamente la mitad de los niños con una infección no tienen síntomas. Otros tienen repentinamente fiebre alta, dolor de cabeza y dolores musculares, y algunos también presentan dolor de garganta, molestias estomacales o náuseas. Un niño con una infección por el virus de coxsackie tal vez solo tenga temperatura y no presente ningún otro síntoma. En la mayoría de los niños, la fiebre dura aproximadamente tres días y después desaparece.
            """.trimIndent()
        )
    )

    fun getVirus(id: String): Virus {
        return viruses.find { it.id == id }!!
    }
}
