/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarot;

import java.util.Arrays;
import java.util.Scanner;
import static tarot.NewClass.subArray;
import static tarot.NewClass.orien;


/**
 *
 * @author Rodri
 */
public class Tarot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sn=new Scanner(System.in);
        String menu;
        
        //Array de cartas
        
        String carta[] = new String[22];

        
        carta[0] ="El Loco";
        carta[1] ="El Mago";
        carta[2] ="La Sacerdotisa";
        carta[3] ="La Emperatriz";
        carta[4] ="El Emperador";
        carta[5] ="El Sumo Sacerdote";
        carta[6] ="Los Enamorados";
        carta[7] ="El Carro";
        carta[8] ="La Fuerza";
        carta[9] ="El Ermitaño";
        carta[10] ="La Rueda de la Fortuna";
        carta[11] ="La Justicia";
        carta[12] ="El Colgado";
        carta[13] ="La Muerte";
        carta[14] ="La Templanza";
        carta[15] ="El Diablo";
        carta[16] ="La Torre";
        carta[17] ="La Estrella";
        carta[18] ="La Luna";
        carta[19] ="El Sol";
        carta[20] ="El Juicio";
        carta[21] ="El Mundo";
        
        //Array de orientacion de las cartas
        String orientacion[] = new String[2];
        
            orientacion[0] ="Normal";
            orientacion[1] ="Invertida";
        
        //Array de los dioses
        String dioses[] = new String[9];
        
        
        dioses[0] ="Osiris: Dios de la fertilidad y de la agricultura.  Preside el juicio de los difuntos.  Se le representa con piel verde u oscura. En la mano porta un látigo y un bastón.";
        dioses[1] ="Horus: Es el dios del cielo. En la cabeza, lleva la corona doble del alto y el bajo Egipto. Representado como un halcón, o un hombre con cabeza de halcón.";
        dioses[2] ="Geb: Dios de la tierra, como soporte físico del mundo No sólo es dios de la superficie de la tierra, sino que tiene autoridad sobre las tumbas y desempeña un importante papel Hombre verde u oscuro con corona y ganso en la cabeza";
        dioses[3] ="Bastet: Diosa protectora del hogar. Daba felicidad.  Su símbolo era el gato: podía representarse como un gato, o como mujer con cabeza de gato.";
        dioses[4] ="Sethan: Dios de la violencia, la brutalidad y lo tenebroso. Es un dios maléfico. Se le representa con cuerpo de hombre, y con cabeza de un animal no identificable.";
        dioses[5] ="Khnum: Dios del agua,que guarda la fuente de la vida, también era el dios guardián de las aguas del mundo inferior y es el dios alfarero que modelaba la persona? Su nombre significa literalmente el moldeador. Se le representa como un humano con cabeza de carnero con agua fluyendo de sus manos y llevando una jarra sobre su cabeza";
        dioses[6] ="Tohth: Dios de la sabiduria, de la escritura, de la música.  Era representado como un hombre con cabeza de ibis.  Inventó todas las palabras y el lenguaje.";
        dioses[7] ="Anubis: Dios de los muertos y los cementerios. Era el encargado de llevar a los difuntos al otro mundo. Estaba presente en la momificación Representado como un hombre con cabeza de chacal.";
        dioses[8] ="Atum: Es Aquel que existe por sí mismo?; dios primordial y creador El dios que conduce al faraón al cielo. Es representado como un humano con la doble corona";
        
        
        
        //Array del significado de las cartas
        String signi[] = new String[22];

        
        signi[0] ="[El Loco]\n"
                + "- Normal:El Loco puede significar la inspiración necesaria para comenzar una nueva empresa, la energía y autoconfianza necesarias para iniciar un proyecto novedoso , incluso cuando los demás consideran que es una locura.\n" +
                                "   Pero, la autoconfianza puede derivar en locura-ignorar los peligros, el entusiasmo que se convierte en delirio, la irresponsabilidad  que surge de preocuparse demasiado poco de lo que piensen los demás,\n"
                                + "   y el menosprecio a la experiencia de los mayores y los más sabios.\n" +
                                "   Que la interpretación vaya en un sentido o en otro dependerá de la posición del Loco y las cartas que le rodeen.\n" +
                                "   El Loco también puede representar el inicio de una nueva etapa de la vida, quizá de un viaje de autodescubrimiento; será un viaje feliz y lleno de ilusiones \n"
                                + " pero no hay que dejarse llevar por el entusiasmo.\n"
                                + "- Invertida:Al aparecer en posición invertida, la advertencia que nos da el Loco se hace más urgente y perentoria; la persona ha perdido la capacidad de razonar con sensatez y está dejándose llevar por los impulsos, y el peligro es grande para esta persona.\n" +
                                "   En algunos casos esta carta puede llegar a significar literalmente una enfermedad mental o un trastorno transitorio, pero no es muy habitual.\n" +
                                "   Un significado que suele estar asociado al Loco invertido es el de los delirios de grandeza, el estar demasiado imbuido de uno mismo, y no escuchar las advertencias ni los buenos consejos.\n"+
                                "   La carta advierte que las consecuencias de este comportamiento son inminentes, y advertir al consultante que se pare a reflexionar y cambie de actitud antes  de que sea demasiado tarde.\n"
                                + "Otro consejo latente en el Loco es el no creer que sabemos más de lo que en realidad sabemos.";
        signi[1] ="[El Mago]\n"
                + "- Normal:Persona inteligente, creativa, práctica, segura de si misma, en control de las situaciones y de las emociones.\n" +
                                "   Lleno de recursos, es  capaz de tomar la iniciativa y de cambiar su realidad.\n" +
                                "   Cuando aparece en una tirada, el Mago representa, bien sea refiriéndose al consultante o a otra persona, a una persona dinámica, hábil, abierta, emprendedora,\n"
                              + " que inicia de forma satisfactoria un nuevo período de su vida el cual será capaz de manejar y controlar.\n" +
                                "   No es el momento para falsas modestias ni dudas.\n" +
                                "   Hay que sacar lo mejor de uno mismo y utilizarlo abiertamente, eso sí, de forma recta y sin caer en el egoísmo y la manipulación, ya que el Mago utiliza su poder sin dañar a nadie.\n"
                + "- Invertida:El consultante ha de tener mucho cuidado, pues se le advierte de la presencia de una persona manipuladora, de un charlatán de feria, que promete mucho y no cumple nada;\n"
                            + "también una persona embaucadora , como un falso vidente o curandero, un vendedor.\n" +
                            "   El Mago invertido representa a la persona que no tiene ideas propias sino que las roba a los demás, o que utiliza su ingenio para engañar y para su propio beneficio.\n" +
                            "   En algunos casos puede representar al propio consultante, advirtiéndole de que su forma de tratar a los demás, manipuladora y arrogante, puede volverse contra él.";
        signi[2] ="[La Sacerdotisa]\n"
                + "- Normal:Persona intuitiva que utiliza de forma segura y acertada su intuición.\n" +
                                        "   No tiene necesariamente que ser mujer, aunque es muy probable que lo sea.\n" +
                                        "   También persona sabia, generalmente mujer, que guía y orienta de forma desinteresada,  muy espiritual y en contacto con lo divino.\n" +
                                        "   Si la carta representa al consultante, le indica que confíe en su intuición o que la utilice más a menudo.\n"
                 + "- Invertida:Mujer que esclaviza a un hombre o a otra persona, por ejemplo a una amiga, por medio del chantaje emocional y atribuyéndose poderes que no tiene, o si los tiene, los usa solo para su propio beneficio.\n" +
                            "   Puede representar a una falsa vidente o simplemente a una manipuladora psicológica.\n" +
                            "   Si representa al consultante, le indica que está descuidando su intuición y desaprovechando sus dotes personales, posiblemente por pereza.";
        signi[3] ="[La Emperatriz]\n"
                + "- Normal:Persona práctica, inteligente y creativa, que sabe poner las ideas en práctica.\n" +
                                        "   Posiblemente es mujer o un hombre con un lado femenino muy acusado.\n" +
                                        "   Esta carta también puede indicar fecundidad económica  (ideas exitosas para negocios, empresas prósperas) y física (embarazo) \n"
                + "- Invertida:Mujer tiránica y dominadora, ?castradora? a nivel físico o mental, que puede ejercer su poder sobre un varón o una mujer; una madre o jefa\n"
                            + " (o un padre o jefe posesivos en exceso) que impiden a la persona desarrollarse.\n" +
                            "   También indica embarazos no deseados, abortos naturales, negocios fallidos o empresas que fracasan porque los implicados no ponen todo de su parte, absorbidos por actividades sociales frívolas.";
        signi[4] ="[El Emperador]\n"
                + "- Normal:Persona, posiblemente varón pero no necesariamente, poderosa y con autoridad.\n" +
                                    "   Hombre experimentado y hábil. Autoridad, poder establecido.\n" +
                                    "   Patrocinio de un mecenas.\n" +
                                    "   Protección o guía de un padre o tutor.\n" +
                                    "   La ley, representada en un juez o en un personaje parecido.\n" +
                                    "   Esta carta también indica que debe dominar la razón y el sentido práctico.\n" +
                                    "   Virilidad, varón fértil.\n"
                + "- Invertida:Tiranía, dominio injusto por medio de la fuerza física o la opresión psicológica.\n" +
                            "   Padre dominante y excesivamente estricto (también puede ser una madre severa).\n" +
                            "   Jefe tiránico.\n" +
                            "   Abusos de poder, explotación.\n" +
                            "   Empresas que fracasan por falta de un guía efectivo, pérdida de una  posición privilegiada.\n" +
                            "   Falta de madurez y de capacidad para hacerse respetar.\n" +
                            "   La fuerza bruta predomina sobre la razón.\n" +
                            "   Infertilidad masculina.";
        signi[5] ="[El Sumo Sacerdote]\n"
                + "- Normal: Sabiduría y autoridad.\n" +
                                            "   Esta carta suele representar a personas que nos inician en el camino de la vida o nos abren una puerta nueva, como profesores o consejeros espirituales.\n" +
                                            "   También puede indicar que el consultante precisa ayuda de un psicólogo o consejero espiritual, o quizá un retiro para reflexionar y ordenar sus ideas.\n" +
                                            "   También indica la existencia de un grupo ideológico o espiritual que puede ayudarnos a encontrar nuestro sitio, o de una persona que puede indicarnos el camino a seguir.\n" +
                                            "   También señala la necesidad de reflexión y de mirarnos ?desde fuera?, replanteando nuestra vida.\n"
                + "- Invertida:Persona estrecha de miras, reaccionaria, anticuada y tiránica.\n" +
                            "   Alguien que quiere pensar por nosotros y manipularnos emocionalmente.\n" +
                            "   Calumnias, chismes e intolerancia.\n" +
                            "   Persona amoral que se oculta detrás de una fachada de moralidad.\n" +
                            "   Político o sacerdote corrupto, amigo manipulador.";
        signi[6] ="[Los Enamorados]\n"
                + "- Normal: Ejercicio del libre albedrío, búsqueda de la realización propia., capacidad de elegir el propio camino.\n" +
                                        "   Amor, pareja, enamoramiento, deseo sexual, formación de una pareja.\n" +
                                        "   Fidelidad a uno mismo, toma de una decisión importante, descubrir lo que uno verdaderamente desea.\n"
                + "- Invertida:Dificultades para decidir, egoísmo, manejar a los otros por comodidad.\n" +
                            "   Amante que traiciona a su pareja por no querer renunciar a una aventura.\n" +
                            "   Sexualidad egoísta que no piensa en complacer al otro.\n" +
                            "   Tentación o prueba.\n" +
                            "   Amor no correspondido o pasión enfermiza.";
        signi[7] ="[El Carro]\n"
                + "- Normal: Victoria sobre obstáculos o sobre los propios defectos.\n" +
                                "   Dominio de uno mismo, persona disciplinada que alcanza el éxito.\n" +
                                "   Habilidad para guiar los propios asuntos.\n" +
                                "   Viajes, ascensos laborales, reconocimiento merecido.\n" +
                                "   Persona que aprende a conocerse a sí misma.\n"
                + "- Invertida:Falta de autocontrol.\n" +
                            "   Persona indisciplinada o frustrada que no acaba de encontrar su vocación.\n" +
                            "   Negocios fallidos.\n" +
                            "   Hay que admitir que una situación nos desborda y pedir ayuda.\n" +
                            "   Viajes innecesarios, falsa sensación de triunfo, egoísmo.\n" +
                            "   Violencia y pasiones que no se controlan.";
        signi[8] ="[La Fuerza]\n"
                + "- Normal: Fuerza física y espiritual.\n" +
                                    "   Capacidad para manejar las situaciones.\n" +
                                    "   Paz espiritual y elevación.\n" +
                                    "   Autoconocimiento, autodominio, disciplina.\n" +
                                    "   Dominio de las pasiones y los instintos.\n" +
                                    "   Energía, creatividad. Perseverancia, habilidad para resolver problemas y para tratar con otras personas.\n" +
                                    "   Confianza en uno mismo.\n"
                + "- Invertida:Falta de energía, debilidad física.\n" +
                            "   Bloqueo espiritual, falta de inspiración, vacío interior.\n" +
                            "   Abuso de poder, manipulación de otros.\n" +
                            "   Excesiva autoindulgencia, escaso autodominio.\n" +
                            "   Poca habilidad social: persona a quien le desbordan las situaciones difíciles.";
        signi[9] ="[El Ermitaño]\n"
                + "- Normal:Prudencia, paciencia, sentido común.\n" +
                                    "   Buen juicio.\n" +
                                    "   Maestro espiritual, persona que da excelentes consejos, sabia y prudente.\n" +
                                    "   Necesidad de consejo y ayuda.\n" +
                                    "   Conveniencia de un retiro espiritual.\n" +
                                    "   Trabajo relacionado con la investigación y el estudio.\n" +
                                    "   Paso del tiempo.\n"
                + "- Invertida:Soledad, abatimiento, retiro excesivo.\n" +
                            "   Falso maestro o guru espiritual, hipócrita o interesado.\n" +
                            "   Malos consejos, ausencia de sentido común.\n" +
                            "   Conspiración, traición, mal amigo, persona que no comprende ni escucha.\n" +
                            "   Llevar mal la edad y el paso del tiempo.";
        signi[10] ="[La Rueda de la Fortuna]\n"
                + "- Normal: Nuevo ciclo de la vida, que puede ser positivo o negativo, pero que normalmente es positivo.\n" +
                                                "   Cambio inesperado que es traído por el destino pero que debemos saber aprovechar y canalizar.\n" +
                                                "   Agilidad mental, sentido de la oportunidad, capacidad para discernir el bien del mal.\n" +
                                                "   Realización de proyectos.\n" +
                                                "   Modifica el significado de cartas negativas anunciando que su influencia no durará mucho.\n" +
                                                "   Evolución de una situación que estaba estancada.\n" +
                                                "   Los acontecimientos empiezan a ocurrir más de prisa.\n"
                + "- Invertida:Cambio negativo, etapa de la vida más bien dura, fin de un ciclo positivo.\n" +
                            "   Aparición de un obstáculo que hay que saber manejar.\n" +
                            "   Si deseamos un cambio, nos avisa que no estamos listos para él.\n" +
                            "   Posición inestable.\n" +
                            "   Beneficio que no es tal, porque durará muy poco.";
        signi[11] ="[La Justicia]\n"
                + "- Normal:Recompensa kármica de acuerdo a nuestros méritos.\n" +
                                    "   Juicio justo.\n" +
                                    "   Acciones legales con resultado favorable.\n" +
                                    "   Paz interior, conciencia tranquila.\n" +
                                    "   Persona justa y equilibrada. Lucha valiente por la verdad y la justicia.\n" +
                                    "   Madurez y serenidad de juicio.\n"
                + "- Invertida:Injusticia cometida o sufrida por el consultante.\n" +
                            "   Daño injusto causado a seres queridos.\n" +
                            "   Pleitos o acciones legales perdidos, generalmente por un fallo injusto, o excesivamente prolongados.\n" +
                            "   Persona injusta y cruel o por el contrario demasiado blanda o indulgente.\n" +
                            "   Cobardía, inmadurez, incapacidad de asumir las consecuencias de nuestros actos";
        signi[12] ="[El Colgado]\n"
                + "- Normal: Persona altruista, que se sacrifica por los demás generosamente.\n" +
                                    "   Cambio de perspectiva, necesidad de mirar desde otro punto de vista.\n" +
                                    "   Decisión, generalmente correcta, que cambia totalmente la perspectiva.\n" +
                                    "   Sabiduría proveniente del inconsciente, tal vez el don de la videncia.\n" +
                                    "   Premoniciones.\n" +
                                    "   Atender más al subconsciente, dejarse llevar, aceptar el destino, saber renunciar a las cosas.\n" +
                                    "   Tomarse tiempo para meditar, volverse al aspecto espiritual de uno mismo.\n"
                + "- Invertida:Fanatismo, falso mártir, persona que aparenta sacrificarse y sólo piensa en su ego.\n" +
                            "   Persona materialista y vacía, que no atiende a su espiritualidad.\n" +
                            "   Estancamiento afectivo.\n" +
                            "   Dar palabras en lugar de hechos.\n" +
                            "   Falso vidente o profeta.\n" +
                            "   Egoísmo, incapacidad de darse a los otros.\n" +
                            "   Empeñarse en el propio punto de vista, cerrar la mente.";
        signi[13] ="[La Muerte]\n"
                + "- Normal:Renovación, cambio.\n" +
                                    "   Pérdida de algo que consideramos valioso, que nos duele dejar, pero que nos está impidiendo avanzar(un amigo, pareja, trabajo?)\n" +
                                    "   Renovación completa del yo, que nos beneficiará. \n"
                + "- Invertida:Estancamiento de un proyecto.\n" +
                            "   Depresión o tristeza.\n" +
                            "   Obstinación en rechazar o retrasar un cambio inevitable.\n" +
                            "   Seguir llorando una muerte o una pérdida, negarse a olvidar.\n" +
                            "   Pesimismo. Pasividad.\n" +
                            "   Enfermo que se niega a cuidarse y pone en peligro su vida.";
        signi[14] ="[La Templanza]\n"
                + "- Normal:Necesidad de paciencia y moderación.\n" +
                                        "   Huir de los extremos.\n" +
                                        "   Relación feliz y equilibrada con la pareja o con amigos.\n" +
                                        "   Sensatez, tranquilidad.\n" +
                                        "   Versatilidad, adaptabilidad.\n" +
                                        "   Necesidad de cooperar con otros y de escuchar sus consejos.\n" +
                                        "   Apertura de mente, rechazo al fanatismo. Buena salud física y mental.\n" +
                                        "   Puede aconsejar llevar una vida más sana.\n" +
                                        "   Consolidación de una vida estable.\n"
                + "- Invertida:Impaciencia, falta de moderación y de prudencia.\n" +
                            "   Persona extremista y exagerada, poco flexible o adaptable.\n" +
                            "   Estrés, necesidad de pararse y reconsiderar.\n" +
                            "   Ausencia de planificación, necesidad de  tener prioridades y buenas ideas.\n" +
                            "   Energía malgastada.\n" +
                            "   Salud, más que mala, mal cuidada.\n" +
                            "   Cansancio, excesos.\n" +
                            "   Necesidad de estabilidad.";
        signi[15] ="[El Diablo]\n"
                + "- Normal:Obsesiones. Adicciones.\n" +
                                    "   Ser esclavo de una persona o situación.\n" +
                                    "   Excesos dañinos para la salud física y mental.\n" +
                                    "   Autoengaños.\n" +
                                    "   Represión emocional y sexual o lo contrario, adicción al sexo o a las relaciones dañinas.\n" +
                                    "   Superficialidad, olvido de la espiritualidad.\n" +
                                    "   Materialismo. Avaricia.\n" +
                                    "   Frustración, sensación de estar atrapado en una situación.\n" +
                                    "   Alguien que nos manipula y controla.\n" +
                                    "   Ignorancia, desconocimiento de lo que es mejor para uno mismo.\n"
                + "- Invertida:Un rayo de esperanza.\n" +
                            "   Momento adecuado para liberarse de una adicción u obsesión.\n" +
                            "   Reconocimiento de que se tiene un problema.\n" +
                            "   Petición de ayuda.\n" +
                            "   Intento de conexión con lo divino, búsqueda espiritual.\n" +
                            "   Vencer obstáculos.\n" +
                            "   Empezar a ser menos egoísta.\n" +
                            "   Búsqueda de la libertad personal";
        signi[16] ="[La Torre]\n"
                + "- Normal:Cambio repentino, generalmente no muy agradable.\n" +
                                    "   Pérdida económica, ruptura de una amistad o relación de pareja.\n" +
                                    "   Darse cuenta de repente de que algo no es como pensábamos.\n" +
                                    "   Una oportunidad para revisar nuestros valores.\n" +
                                    "   Descubrimiento de defectos que no sabíamos que teníamos, y que nos sabe mal descubrir.\n" +
                                    "   Admitir errores y volver a empezar.\n" +
                                    "   Aceptar las limitaciones.\n" +
                                    "   Ilusiones que se vienen abajo, porque eran imposibles o perjudiciales.\n" +
                                    "   Toma de contacto con la realidad.\n" +
                                    "   Período de transición que nos conducirá a algo mejor si sabemos aprovecharlo.\n"
                + " -Invertida:Caos, estancamiento.\n" +
                            "   La persona se resiste a cambiar aunque le hace falta.\n" +
                            "   Ceguera ante la realidad.\n" +
                            "   Falta de humildad para aceptar los errores.\n" +
                            "   Falta de voluntad para salir de una situación negativa.\n" +
                            "   Miedo al cambio.\n" +
                            "   Dejarse oprimir por otros.";
        signi[17] ="[La Estrella]\n"
                + "- Normal: Esperanza. Ilusión.\n" +
                                "   Luz al final del túnel.\n" +
                                "   La persona llega al final de un período difícil.\n" +
                                "   Inspiración que llega cuando más falta hace.\n" +
                                "   Creatividad artística.\n" +
                                "   Paz interior.\n" +
                                "   Llega ayuda largo tiempo esperada.\n" +
                                "   Optimismo.\n" +
                                "   Alegría de vivir.\n" +
                                "   Sueño que se cumple.\n" +
                                "   Armonía, equilibrio, paz espiritual.\n"
                + "- Invertida:Optimismo excesivo y cegador.\n" +
                            "   Esperanzas que no se cumplen.\n" +
                            "   Decepción.\n" +
                            "   Ceguera, cerrazón, falta de inspiración.\n" +
                            "   Disarmonía.\n" +
                            "   Situación que no acaba de resolverse.\n" +
                            "   Mentalidad estrecha.\n" +
                            "   Falta de autoestima y de paz.";
        signi[18] ="[La Luna]\n"
                + "- Normal:Falsas ilusiones.\n" +
                    "   Autoengaño.\n" +
                    "   Falso concepto de uno mismo.\n" +
                    "   Engaños de otros que preferimos creer.\n" +
                    "   El inconsciente con todos sus beneficios e inconvenientes. Riesgos, mentiras, posible escándalo en el que nos vemos envueltos sin quererlo.\n" +
                    "   Imaginación que hay que saber controlar.\n" +
                    "   Intuición y talento. visiones que hay que discernir si son verdaderas o falsas.\n" +
                    "   Sueños premonitorios.\n" +
                    "   Confusión, incertidumbre\n"
                + "- Invertida:Mentiras pequeñas que se descubren fácilmente.\n" +
                            "   Vencer la tentación.\n" +
                            "   Misterios resueltos.\n" +
                            "   Se descubre a una persona que nos ha estado engañando.\n" +
                            "   Claridad mental.\n" +
                            "   Termina un estado de confusión.";
        signi[19] ="[El Sol]\n"
                + "- Normal:Necesidad de revisar nuestros proyectos y cambiarlos.\n" +
                                "   Bloqueo.\n" +
                                "   Exito que llegará pero con retraso.\n" +
                                "   Autoengaño, creer que tenemos éxito cuando no lo tenemos.\n" +
                                "   Soledad, necesidad de amigos que nos orienten y apoyen.\n" +
                                "   Necesidad de colaboradores y consejeros para nuestros negocios y proyectos.\n" +
                                "   Proyecto cancelado o postergado.\n"
                + "- Invertida:Alegría. Victoria. Satisfacción.\n" +
                            "   Logros materiales y felicidad emocional.\n" +
                            "   Confianza en uno mismo.\n" +
                            "   Crecimiento en todas las áreas de la vida, madurez.\n" +
                            "   Etapa dorada de una relación, matrimonio o emparejamiento como culminación de una relación.\n" +
                            "   Maternidad deseada que por fin se realiza.\n" +
                            "   Buenos amigos, familia cariñosa y cálida.\n" +
                            "   Exito por el que se ha trabajado mucho.\n" +
                            "   Obra artística que materializa una gran inspiración.\n" +
                            "   Libertad, liberación, sobre todo a nivel espiritual.";
        signi[20] ="[El Juicio]\n"
                + "- Normal: Recompensa por nuestros actos.\n" +
                                    "   Recogemos lo que sembramos.\n" +
                                    "   Comportamiento correcto que recibe premio.\n" +
                                    "   Desafío que afrontaremos con éxito.\n" +
                                    "   Renacimiento, resurrección espiritual después de una época difícil.\n" +
                                    "   Liberación.\n" +
                                    "   Elevación espiritual.\n" +
                                    "   Llamada vocacional o espiritual que debemos escuchar, momento decisivo, cambio de vida.\n" +
                                    "   Posible juicio legal que se afrontará con éxito.\n" +
                                    "   Superación de pruebas.\n" +
                                    "   Eliminación de restricciones y obstáculos.\n"
                + "- Invertida:Recogemos las consecuencias de actos negativos.\n" +
                            "   Deuda kármica que hay que pagar.\n" +
                            "   Exceso de cosas que no funcionan en nuestra vida.\n" +
                            "   Indecisión, incapacidad de tomar decisiones correctas o de escuchar la llamada de nuestro interior.\n" +
                            "   Momento de dejar cosas atrás y de liberarse de restricciones.\n" +
                            "   Problemas legales. ";
        signi[21] ="[El Mundo]\n"
                + "- Normal:Cumplimiento de deseos y objetivos.\n" +
                                "   Realización y culminación de proyectos.\n" +
                                "   Comprensión plena de la lección que implica cada una de nuestras experiencias negativas.\n" +
                                "   Libertad absoluta para obrar, madurez plena e independencia.\n" +
                                "   Capacidad de enseñar a otros gracias a nuestras experiencias.\n" +
                                "   Ascenso en el trabajo o cambio a otra carrera más gratificante.\n" +
                                "   Conciencia cósmica.\n" +
                                "   Viajes, sobre todo viajes muy deseados.\n"
                + "- Invertida:Inercia, falta de ánimo, falta de energía, debilidad.\n" +
                            "   Incapacidad de aprender de nuestras experiencias.\n" +
                            "   Falta de visión de futuro.\n" +
                            "   Miedo al cambio.\n" +
                            "   Necesidad de trabajar más para llegar a nuestros proyectos\n" +
                            "   Obstáculos que ponemos nosotros mismos o nos ponen otros,Decepción.";

              System.out.println(
"                                                           __^__                                      __^__\n" +
"                                                          ( ___ )------------------------------------( ___ )\n" +
"                                                           | / |                                      | / |\n" +
"                                                           | / |     Bienvenido al Tarot Virtual      | / |\n" +
"                                                           |___|                                      |___|\n" +
"                                                          (_____)------------------------------------(_____)"); 
        //Repetir menu
         do{      
        
              System.out.println("¿Que desea saber?"); 
              System.out.println("Menu:");
                            System.out.println("\n");
                System.out.println("1-Tirada Simple: \nEl pasado\n" +
                "El presente\n" +
                "El futuro.");
                            System.out.println("\n");
                System.out.println("2-La Cruz Simple: \n1: estado actual del consultante, su situación, sus problemas.\n" +
                "2: mundo exterior, lo que rodea al consultante y cómo influye en su estado actual.\n" +
                "3: sentimientos, estado de ánimo, pensamientos, ideas, opiniones, yo interior del consultante relacionado con su situación.\n" +
                "4: desenlace, destino, solución a su situación.");
                            System.out.println("\n");
                System.out.println("3-Tirada Rápida:\nLas cartas centrales\n" +
                "(2 y 5), resultado final.\n" +
                "La hilera superior\n" +
                "(1,2 y 3) Futuro próximo.\n" +
                "La hilera inferior\n" +
                "(4, 5 y 6) futuro lejano.\n" +
                "(5 y 6) sucesos inesperados u obstaculos.\n" +
                "(1 y 4) influencias beneficiosas y prácticas");
                            System.out.println("\n");
                 System.out.println("4-Consejo de los Dioses: ");
                            System.out.println("\n");
                 System.out.println("5-Consulta de informacion de arcanos: ");
                                             System.out.println("\n");
                 System.out.println("Para salir escriba la palabra (Fin)"); 
                            System.out.println("\n");System.out.println("\n");
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                 
        menu=sn.nextLine(); 

        switch (menu) {
            case "1" -> {
                System.out.println("Ha elegido la Tirada Simple:");
                                System.out.println("	  __^__                                      __^__\n" +
                                               "         ( ___ )------------------------------------( ___ )\n" +
                                               "          | / |                                      | / |\n" +
                                               "          | / |             Tirada Simple            | / |\n" +
                                               "          |___|                                      |___|\n" +
                                               "         (_____)------------------------------------(_____) ");
                  for(int i=0;i<3;i++){
                    int maxSize=1;
                      System.out.print(Arrays.toString(subArray(maxSize,carta)));
                      System.out.println(Arrays.toString(orien(maxSize,orientacion)));
                    }
                                              System.out.println("\n");
                  System.out.println("Si hay alguna carta repetida vuelva pulsar el numero");
                  System.out.println("Para consultar el siginficado de la tirada escribe 5");
                  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("\n"); System.out.println("\n"); System.out.println("\n");
                }
            case "2" -> {
                System.out.println("Ha elegido la La Cruz Simple:");
                                System.out.println("	  __^__                                      __^__\n" +
                                               "         ( ___ )------------------------------------( ___ )\n" +
                                               "          | / |                                      | / |\n" +
                                               "          | / |            La Cruz Simple            | / |\n" +
                                               "          |___|                                      |___|\n" +
                                               "         (_____)------------------------------------(_____) ");
                 for(int i=0;i<4;i++){
                    int maxSize=1;
                      System.out.print(Arrays.toString(subArray(maxSize,carta)));
                      System.out.println(Arrays.toString(orien(maxSize,orientacion)));
                    }
                                                               System.out.println("\n");
                  System.out.println("Si hay alguna carta repetida vuelva pulsar el numero");
                  System.out.println("Para consultar el siginficado de la tirada escribe 5");
                  System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("\n"); System.out.println("\n"); System.out.println("\n");
            }

            case "3" -> {
                System.out.println("Ha elegido la Tirada Rápida:");
                                System.out.println("	  __^__                                      __^__\n" +
                                               "         ( ___ )------------------------------------( ___ )\n" +
                                               "          | / |                                      | / |\n" +
                                               "          | / |           Tirada Rápida              | / |\n" +
                                               "          |___|                                      |___|\n" +
                                               "         (_____)------------------------------------(_____) ");
                for(int i=0;i<6;i++){
                    int maxSize=1;
                      System.out.print(Arrays.toString(subArray(maxSize,carta)));
                      System.out.println(Arrays.toString(orien(maxSize,orientacion)));
                    }
                                                              System.out.println("\n");
                 System.out.println("Si hay alguna carta repetida vuelva pulsar el numero");                                             
                 System.out.println("Para consultar el siginficado de la tirada escribe 5");
                 System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                 System.out.println("\n"); System.out.println("\n"); System.out.println("\n");
                }
            case "4" -> {
                System.out.println("Ha elegido Consejo de los Dioses:");
                                System.out.println("	  __^__                                      __^__\n" +
                                               "         ( ___ )------------------------------------( ___ )\n" +
                                               "          | / |                                      | / |\n" +
                                               "          | / |        Consejo de los Dioses         | / |\n" +
                                               "          |___|                                      |___|\n" +
                                               "         (_____)------------------------------------(_____) ");
                
                for(int i=0;i<1;i++){
                    int maxSize=1;
                      System.out.println(Arrays.toString(subArray(maxSize,dioses)));
                    }
                 System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                 System.out.println("\n"); System.out.println("\n"); System.out.println("\n");
            }
            case "5" -> {
                System.out.println("Ha elegido Consulta de informacion de arcanos:");
                                System.out.println("	  __^__                                      __^__\n" +
                                               "         ( ___ )------------------------------------( ___ )\n" +
                                               "          | / |                                      | / |\n" +
                                               "          | / |        Diccionario de arcanos        | / |\n" +
                                               "          |___|                                      |___|\n" +
                                               "         (_____)------------------------------------(_____) ");
                //Consultas crear una funcion
                for (int i=0; i<signi.length; i++) {
                    System.out.println(signi[i]);
                
                }
                 System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                 System.out.println("\n"); System.out.println("\n"); System.out.println("\n");
                 
                }
            default -> System.out.println("");   
        }
        }while(menu.equals("Fin")!=(true));
            System.out.println("Saliendo del sistema"); 
            
                /*Imprimir La baraja
                for (int i=0; i<carta.length; i++) {
                System.out.println(carta[i]);
                
                }*/
                
    }
    
}

