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
        carta[9] ="El Ermita�o";
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
        
        
        dioses[0] ="Osiris: Dios de la fertilidad y de la agricultura.  Preside el juicio de los difuntos.  Se le representa con piel verde u oscura. En la mano porta un l�tigo y un bast�n.";
        dioses[1] ="Horus: Es el dios del cielo. En la cabeza, lleva la corona doble del alto y el bajo Egipto. Representado como un halc�n, o un hombre con cabeza de halc�n.";
        dioses[2] ="Geb: Dios de la tierra, como soporte f�sico del mundo No s�lo es dios de la superficie de la tierra, sino que tiene autoridad sobre las tumbas y desempe�a un importante papel Hombre verde u oscuro con corona y ganso en la cabeza";
        dioses[3] ="Bastet: Diosa protectora del hogar. Daba felicidad.  Su s�mbolo era el gato: pod�a representarse como un gato, o como mujer con cabeza de gato.";
        dioses[4] ="Sethan: Dios de la violencia, la brutalidad y lo tenebroso. Es un dios mal�fico. Se le representa con cuerpo de hombre, y con cabeza de un animal no identificable.";
        dioses[5] ="Khnum: Dios del agua,que guarda la fuente de la vida, tambi�n era el dios guardi�n de las aguas del mundo inferior y es el dios alfarero que modelaba la persona? Su nombre significa literalmente el moldeador. Se le representa como un humano con cabeza de carnero con agua fluyendo de sus manos y llevando una jarra sobre su cabeza";
        dioses[6] ="Tohth: Dios de la sabiduria, de la escritura, de la m�sica.  Era representado como un hombre con cabeza de ibis.  Invent� todas las palabras y el lenguaje.";
        dioses[7] ="Anubis: Dios de los muertos y los cementerios. Era el encargado de llevar a los difuntos al otro mundo. Estaba presente en la momificaci�n Representado como un hombre con cabeza de chacal.";
        dioses[8] ="Atum: Es Aquel que existe por s� mismo?; dios primordial y creador El dios que conduce al fara�n al cielo. Es representado como un humano con la doble corona";
        
        
        
        //Array del significado de las cartas
        String signi[] = new String[22];

        
        signi[0] ="[El Loco]\n"
                + "- Normal:El Loco puede significar la inspiraci�n necesaria para comenzar una nueva empresa, la energ�a y autoconfianza necesarias para iniciar un proyecto novedoso , incluso cuando los dem�s consideran que es una locura.\n" +
                                "   Pero, la autoconfianza puede derivar en locura-ignorar los peligros, el entusiasmo que se convierte en delirio, la irresponsabilidad  que surge de preocuparse demasiado poco de lo que piensen los dem�s,\n"
                                + "   y el menosprecio a la experiencia de los mayores y los m�s sabios.\n" +
                                "   Que la interpretaci�n vaya en un sentido o en otro depender� de la posici�n del Loco y las cartas que le rodeen.\n" +
                                "   El Loco tambi�n puede representar el inicio de una nueva etapa de la vida, quiz� de un viaje de autodescubrimiento; ser� un viaje feliz y lleno de ilusiones \n"
                                + " pero no hay que dejarse llevar por el entusiasmo.\n"
                                + "- Invertida:Al aparecer en posici�n invertida, la advertencia que nos da el Loco se hace m�s urgente y perentoria; la persona ha perdido la capacidad de razonar con sensatez y est� dej�ndose llevar por los impulsos, y el peligro es grande para esta persona.\n" +
                                "   En algunos casos esta carta puede llegar a significar literalmente una enfermedad mental o un trastorno transitorio, pero no es muy habitual.\n" +
                                "   Un significado que suele estar asociado al Loco invertido es el de los delirios de grandeza, el estar demasiado imbuido de uno mismo, y no escuchar las advertencias ni los buenos consejos.\n"+
                                "   La carta advierte que las consecuencias de este comportamiento son inminentes, y advertir al consultante que se pare a reflexionar y cambie de actitud antes  de que sea demasiado tarde.\n"
                                + "Otro consejo latente en el Loco es el no creer que sabemos m�s de lo que en realidad sabemos.";
        signi[1] ="[El Mago]\n"
                + "- Normal:Persona inteligente, creativa, pr�ctica, segura de si misma, en control de las situaciones y de las emociones.\n" +
                                "   Lleno de recursos, es  capaz de tomar la iniciativa y de cambiar su realidad.\n" +
                                "   Cuando aparece en una tirada, el Mago representa, bien sea refiri�ndose al consultante o a otra persona, a una persona din�mica, h�bil, abierta, emprendedora,\n"
                              + " que inicia de forma satisfactoria un nuevo per�odo de su vida el cual ser� capaz de manejar y controlar.\n" +
                                "   No es el momento para falsas modestias ni dudas.\n" +
                                "   Hay que sacar lo mejor de uno mismo y utilizarlo abiertamente, eso s�, de forma recta y sin caer en el ego�smo y la manipulaci�n, ya que el Mago utiliza su poder sin da�ar a nadie.\n"
                + "- Invertida:El consultante ha de tener mucho cuidado, pues se le advierte de la presencia de una persona manipuladora, de un charlat�n de feria, que promete mucho y no cumple nada;\n"
                            + "tambi�n una persona embaucadora , como un falso vidente o curandero, un vendedor.\n" +
                            "   El Mago invertido representa a la persona que no tiene ideas propias sino que las roba a los dem�s, o que utiliza su ingenio para enga�ar y para su propio beneficio.\n" +
                            "   En algunos casos puede representar al propio consultante, advirti�ndole de que su forma de tratar a los dem�s, manipuladora y arrogante, puede volverse contra �l.";
        signi[2] ="[La Sacerdotisa]\n"
                + "- Normal:Persona intuitiva que utiliza de forma segura y acertada su intuici�n.\n" +
                                        "   No tiene necesariamente que ser mujer, aunque es muy probable que lo sea.\n" +
                                        "   Tambi�n persona sabia, generalmente mujer, que gu�a y orienta de forma desinteresada,  muy espiritual y en contacto con lo divino.\n" +
                                        "   Si la carta representa al consultante, le indica que conf�e en su intuici�n o que la utilice m�s a menudo.\n"
                 + "- Invertida:Mujer que esclaviza a un hombre o a otra persona, por ejemplo a una amiga, por medio del chantaje emocional y atribuy�ndose poderes que no tiene, o si los tiene, los usa solo para su propio beneficio.\n" +
                            "   Puede representar a una falsa vidente o simplemente a una manipuladora psicol�gica.\n" +
                            "   Si representa al consultante, le indica que est� descuidando su intuici�n y desaprovechando sus dotes personales, posiblemente por pereza.";
        signi[3] ="[La Emperatriz]\n"
                + "- Normal:Persona pr�ctica, inteligente y creativa, que sabe poner las ideas en pr�ctica.\n" +
                                        "   Posiblemente es mujer o un hombre con un lado femenino muy acusado.\n" +
                                        "   Esta carta tambi�n puede indicar fecundidad econ�mica  (ideas exitosas para negocios, empresas pr�speras) y f�sica (embarazo) \n"
                + "- Invertida:Mujer tir�nica y dominadora, ?castradora? a nivel f�sico o mental, que puede ejercer su poder sobre un var�n o una mujer; una madre o jefa\n"
                            + " (o un padre o jefe posesivos en exceso) que impiden a la persona desarrollarse.\n" +
                            "   Tambi�n indica embarazos no deseados, abortos naturales, negocios fallidos o empresas que fracasan porque los implicados no ponen todo de su parte, absorbidos por actividades sociales fr�volas.";
        signi[4] ="[El Emperador]\n"
                + "- Normal:Persona, posiblemente var�n pero no necesariamente, poderosa y con autoridad.\n" +
                                    "   Hombre experimentado y h�bil. Autoridad, poder establecido.\n" +
                                    "   Patrocinio de un mecenas.\n" +
                                    "   Protecci�n o gu�a de un padre o tutor.\n" +
                                    "   La ley, representada en un juez o en un personaje parecido.\n" +
                                    "   Esta carta tambi�n indica que debe dominar la raz�n y el sentido pr�ctico.\n" +
                                    "   Virilidad, var�n f�rtil.\n"
                + "- Invertida:Tiran�a, dominio injusto por medio de la fuerza f�sica o la opresi�n psicol�gica.\n" +
                            "   Padre dominante y excesivamente estricto (tambi�n puede ser una madre severa).\n" +
                            "   Jefe tir�nico.\n" +
                            "   Abusos de poder, explotaci�n.\n" +
                            "   Empresas que fracasan por falta de un gu�a efectivo, p�rdida de una  posici�n privilegiada.\n" +
                            "   Falta de madurez y de capacidad para hacerse respetar.\n" +
                            "   La fuerza bruta predomina sobre la raz�n.\n" +
                            "   Infertilidad masculina.";
        signi[5] ="[El Sumo Sacerdote]\n"
                + "- Normal: Sabidur�a y autoridad.\n" +
                                            "   Esta carta suele representar a personas que nos inician en el camino de la vida o nos abren una puerta nueva, como profesores o consejeros espirituales.\n" +
                                            "   Tambi�n puede indicar que el consultante precisa ayuda de un psic�logo o consejero espiritual, o quiz� un retiro para reflexionar y ordenar sus ideas.\n" +
                                            "   Tambi�n indica la existencia de un grupo ideol�gico o espiritual que puede ayudarnos a encontrar nuestro sitio, o de una persona que puede indicarnos el camino a seguir.\n" +
                                            "   Tambi�n se�ala la necesidad de reflexi�n y de mirarnos ?desde fuera?, replanteando nuestra vida.\n"
                + "- Invertida:Persona estrecha de miras, reaccionaria, anticuada y tir�nica.\n" +
                            "   Alguien que quiere pensar por nosotros y manipularnos emocionalmente.\n" +
                            "   Calumnias, chismes e intolerancia.\n" +
                            "   Persona amoral que se oculta detr�s de una fachada de moralidad.\n" +
                            "   Pol�tico o sacerdote corrupto, amigo manipulador.";
        signi[6] ="[Los Enamorados]\n"
                + "- Normal: Ejercicio del libre albedr�o, b�squeda de la realizaci�n propia., capacidad de elegir el propio camino.\n" +
                                        "   Amor, pareja, enamoramiento, deseo sexual, formaci�n de una pareja.\n" +
                                        "   Fidelidad a uno mismo, toma de una decisi�n importante, descubrir lo que uno verdaderamente desea.\n"
                + "- Invertida:Dificultades para decidir, ego�smo, manejar a los otros por comodidad.\n" +
                            "   Amante que traiciona a su pareja por no querer renunciar a una aventura.\n" +
                            "   Sexualidad ego�sta que no piensa en complacer al otro.\n" +
                            "   Tentaci�n o prueba.\n" +
                            "   Amor no correspondido o pasi�n enfermiza.";
        signi[7] ="[El Carro]\n"
                + "- Normal: Victoria sobre obst�culos o sobre los propios defectos.\n" +
                                "   Dominio de uno mismo, persona disciplinada que alcanza el �xito.\n" +
                                "   Habilidad para guiar los propios asuntos.\n" +
                                "   Viajes, ascensos laborales, reconocimiento merecido.\n" +
                                "   Persona que aprende a conocerse a s� misma.\n"
                + "- Invertida:Falta de autocontrol.\n" +
                            "   Persona indisciplinada o frustrada que no acaba de encontrar su vocaci�n.\n" +
                            "   Negocios fallidos.\n" +
                            "   Hay que admitir que una situaci�n nos desborda y pedir ayuda.\n" +
                            "   Viajes innecesarios, falsa sensaci�n de triunfo, ego�smo.\n" +
                            "   Violencia y pasiones que no se controlan.";
        signi[8] ="[La Fuerza]\n"
                + "- Normal: Fuerza f�sica y espiritual.\n" +
                                    "   Capacidad para manejar las situaciones.\n" +
                                    "   Paz espiritual y elevaci�n.\n" +
                                    "   Autoconocimiento, autodominio, disciplina.\n" +
                                    "   Dominio de las pasiones y los instintos.\n" +
                                    "   Energ�a, creatividad. Perseverancia, habilidad para resolver problemas y para tratar con otras personas.\n" +
                                    "   Confianza en uno mismo.\n"
                + "- Invertida:Falta de energ�a, debilidad f�sica.\n" +
                            "   Bloqueo espiritual, falta de inspiraci�n, vac�o interior.\n" +
                            "   Abuso de poder, manipulaci�n de otros.\n" +
                            "   Excesiva autoindulgencia, escaso autodominio.\n" +
                            "   Poca habilidad social: persona a quien le desbordan las situaciones dif�ciles.";
        signi[9] ="[El Ermita�o]\n"
                + "- Normal:Prudencia, paciencia, sentido com�n.\n" +
                                    "   Buen juicio.\n" +
                                    "   Maestro espiritual, persona que da excelentes consejos, sabia y prudente.\n" +
                                    "   Necesidad de consejo y ayuda.\n" +
                                    "   Conveniencia de un retiro espiritual.\n" +
                                    "   Trabajo relacionado con la investigaci�n y el estudio.\n" +
                                    "   Paso del tiempo.\n"
                + "- Invertida:Soledad, abatimiento, retiro excesivo.\n" +
                            "   Falso maestro o guru espiritual, hip�crita o interesado.\n" +
                            "   Malos consejos, ausencia de sentido com�n.\n" +
                            "   Conspiraci�n, traici�n, mal amigo, persona que no comprende ni escucha.\n" +
                            "   Llevar mal la edad y el paso del tiempo.";
        signi[10] ="[La Rueda de la Fortuna]\n"
                + "- Normal: Nuevo ciclo de la vida, que puede ser positivo o negativo, pero que normalmente es positivo.\n" +
                                                "   Cambio inesperado que es tra�do por el destino pero que debemos saber aprovechar y canalizar.\n" +
                                                "   Agilidad mental, sentido de la oportunidad, capacidad para discernir el bien del mal.\n" +
                                                "   Realizaci�n de proyectos.\n" +
                                                "   Modifica el significado de cartas negativas anunciando que su influencia no durar� mucho.\n" +
                                                "   Evoluci�n de una situaci�n que estaba estancada.\n" +
                                                "   Los acontecimientos empiezan a ocurrir m�s de prisa.\n"
                + "- Invertida:Cambio negativo, etapa de la vida m�s bien dura, fin de un ciclo positivo.\n" +
                            "   Aparici�n de un obst�culo que hay que saber manejar.\n" +
                            "   Si deseamos un cambio, nos avisa que no estamos listos para �l.\n" +
                            "   Posici�n inestable.\n" +
                            "   Beneficio que no es tal, porque durar� muy poco.";
        signi[11] ="[La Justicia]\n"
                + "- Normal:Recompensa k�rmica de acuerdo a nuestros m�ritos.\n" +
                                    "   Juicio justo.\n" +
                                    "   Acciones legales con resultado favorable.\n" +
                                    "   Paz interior, conciencia tranquila.\n" +
                                    "   Persona justa y equilibrada. Lucha valiente por la verdad y la justicia.\n" +
                                    "   Madurez y serenidad de juicio.\n"
                + "- Invertida:Injusticia cometida o sufrida por el consultante.\n" +
                            "   Da�o injusto causado a seres queridos.\n" +
                            "   Pleitos o acciones legales perdidos, generalmente por un fallo injusto, o excesivamente prolongados.\n" +
                            "   Persona injusta y cruel o por el contrario demasiado blanda o indulgente.\n" +
                            "   Cobard�a, inmadurez, incapacidad de asumir las consecuencias de nuestros actos";
        signi[12] ="[El Colgado]\n"
                + "- Normal: Persona altruista, que se sacrifica por los dem�s generosamente.\n" +
                                    "   Cambio de perspectiva, necesidad de mirar desde otro punto de vista.\n" +
                                    "   Decisi�n, generalmente correcta, que cambia totalmente la perspectiva.\n" +
                                    "   Sabidur�a proveniente del inconsciente, tal vez el don de la videncia.\n" +
                                    "   Premoniciones.\n" +
                                    "   Atender m�s al subconsciente, dejarse llevar, aceptar el destino, saber renunciar a las cosas.\n" +
                                    "   Tomarse tiempo para meditar, volverse al aspecto espiritual de uno mismo.\n"
                + "- Invertida:Fanatismo, falso m�rtir, persona que aparenta sacrificarse y s�lo piensa en su ego.\n" +
                            "   Persona materialista y vac�a, que no atiende a su espiritualidad.\n" +
                            "   Estancamiento afectivo.\n" +
                            "   Dar palabras en lugar de hechos.\n" +
                            "   Falso vidente o profeta.\n" +
                            "   Ego�smo, incapacidad de darse a los otros.\n" +
                            "   Empe�arse en el propio punto de vista, cerrar la mente.";
        signi[13] ="[La Muerte]\n"
                + "- Normal:Renovaci�n, cambio.\n" +
                                    "   P�rdida de algo que consideramos valioso, que nos duele dejar, pero que nos est� impidiendo avanzar(un amigo, pareja, trabajo?)\n" +
                                    "   Renovaci�n completa del yo, que nos beneficiar�. \n"
                + "- Invertida:Estancamiento de un proyecto.\n" +
                            "   Depresi�n o tristeza.\n" +
                            "   Obstinaci�n en rechazar o retrasar un cambio inevitable.\n" +
                            "   Seguir llorando una muerte o una p�rdida, negarse a olvidar.\n" +
                            "   Pesimismo. Pasividad.\n" +
                            "   Enfermo que se niega a cuidarse y pone en peligro su vida.";
        signi[14] ="[La Templanza]\n"
                + "- Normal:Necesidad de paciencia y moderaci�n.\n" +
                                        "   Huir de los extremos.\n" +
                                        "   Relaci�n feliz y equilibrada con la pareja o con amigos.\n" +
                                        "   Sensatez, tranquilidad.\n" +
                                        "   Versatilidad, adaptabilidad.\n" +
                                        "   Necesidad de cooperar con otros y de escuchar sus consejos.\n" +
                                        "   Apertura de mente, rechazo al fanatismo. Buena salud f�sica y mental.\n" +
                                        "   Puede aconsejar llevar una vida m�s sana.\n" +
                                        "   Consolidaci�n de una vida estable.\n"
                + "- Invertida:Impaciencia, falta de moderaci�n y de prudencia.\n" +
                            "   Persona extremista y exagerada, poco flexible o adaptable.\n" +
                            "   Estr�s, necesidad de pararse y reconsiderar.\n" +
                            "   Ausencia de planificaci�n, necesidad de  tener prioridades y buenas ideas.\n" +
                            "   Energ�a malgastada.\n" +
                            "   Salud, m�s que mala, mal cuidada.\n" +
                            "   Cansancio, excesos.\n" +
                            "   Necesidad de estabilidad.";
        signi[15] ="[El Diablo]\n"
                + "- Normal:Obsesiones. Adicciones.\n" +
                                    "   Ser esclavo de una persona o situaci�n.\n" +
                                    "   Excesos da�inos para la salud f�sica y mental.\n" +
                                    "   Autoenga�os.\n" +
                                    "   Represi�n emocional y sexual o lo contrario, adicci�n al sexo o a las relaciones da�inas.\n" +
                                    "   Superficialidad, olvido de la espiritualidad.\n" +
                                    "   Materialismo. Avaricia.\n" +
                                    "   Frustraci�n, sensaci�n de estar atrapado en una situaci�n.\n" +
                                    "   Alguien que nos manipula y controla.\n" +
                                    "   Ignorancia, desconocimiento de lo que es mejor para uno mismo.\n"
                + "- Invertida:Un rayo de esperanza.\n" +
                            "   Momento adecuado para liberarse de una adicci�n u obsesi�n.\n" +
                            "   Reconocimiento de que se tiene un problema.\n" +
                            "   Petici�n de ayuda.\n" +
                            "   Intento de conexi�n con lo divino, b�squeda espiritual.\n" +
                            "   Vencer obst�culos.\n" +
                            "   Empezar a ser menos ego�sta.\n" +
                            "   B�squeda de la libertad personal";
        signi[16] ="[La Torre]\n"
                + "- Normal:Cambio repentino, generalmente no muy agradable.\n" +
                                    "   P�rdida econ�mica, ruptura de una amistad o relaci�n de pareja.\n" +
                                    "   Darse cuenta de repente de que algo no es como pens�bamos.\n" +
                                    "   Una oportunidad para revisar nuestros valores.\n" +
                                    "   Descubrimiento de defectos que no sab�amos que ten�amos, y que nos sabe mal descubrir.\n" +
                                    "   Admitir errores y volver a empezar.\n" +
                                    "   Aceptar las limitaciones.\n" +
                                    "   Ilusiones que se vienen abajo, porque eran imposibles o perjudiciales.\n" +
                                    "   Toma de contacto con la realidad.\n" +
                                    "   Per�odo de transici�n que nos conducir� a algo mejor si sabemos aprovecharlo.\n"
                + " -Invertida:Caos, estancamiento.\n" +
                            "   La persona se resiste a cambiar aunque le hace falta.\n" +
                            "   Ceguera ante la realidad.\n" +
                            "   Falta de humildad para aceptar los errores.\n" +
                            "   Falta de voluntad para salir de una situaci�n negativa.\n" +
                            "   Miedo al cambio.\n" +
                            "   Dejarse oprimir por otros.";
        signi[17] ="[La Estrella]\n"
                + "- Normal: Esperanza. Ilusi�n.\n" +
                                "   Luz al final del t�nel.\n" +
                                "   La persona llega al final de un per�odo dif�cil.\n" +
                                "   Inspiraci�n que llega cuando m�s falta hace.\n" +
                                "   Creatividad art�stica.\n" +
                                "   Paz interior.\n" +
                                "   Llega ayuda largo tiempo esperada.\n" +
                                "   Optimismo.\n" +
                                "   Alegr�a de vivir.\n" +
                                "   Sue�o que se cumple.\n" +
                                "   Armon�a, equilibrio, paz espiritual.\n"
                + "- Invertida:Optimismo excesivo y cegador.\n" +
                            "   Esperanzas que no se cumplen.\n" +
                            "   Decepci�n.\n" +
                            "   Ceguera, cerraz�n, falta de inspiraci�n.\n" +
                            "   Disarmon�a.\n" +
                            "   Situaci�n que no acaba de resolverse.\n" +
                            "   Mentalidad estrecha.\n" +
                            "   Falta de autoestima y de paz.";
        signi[18] ="[La Luna]\n"
                + "- Normal:Falsas ilusiones.\n" +
                    "   Autoenga�o.\n" +
                    "   Falso concepto de uno mismo.\n" +
                    "   Enga�os de otros que preferimos creer.\n" +
                    "   El inconsciente con todos sus beneficios e inconvenientes. Riesgos, mentiras, posible esc�ndalo en el que nos vemos envueltos sin quererlo.\n" +
                    "   Imaginaci�n que hay que saber controlar.\n" +
                    "   Intuici�n y talento. visiones que hay que discernir si son verdaderas o falsas.\n" +
                    "   Sue�os premonitorios.\n" +
                    "   Confusi�n, incertidumbre\n"
                + "- Invertida:Mentiras peque�as que se descubren f�cilmente.\n" +
                            "   Vencer la tentaci�n.\n" +
                            "   Misterios resueltos.\n" +
                            "   Se descubre a una persona que nos ha estado enga�ando.\n" +
                            "   Claridad mental.\n" +
                            "   Termina un estado de confusi�n.";
        signi[19] ="[El Sol]\n"
                + "- Normal:Necesidad de revisar nuestros proyectos y cambiarlos.\n" +
                                "   Bloqueo.\n" +
                                "   Exito que llegar� pero con retraso.\n" +
                                "   Autoenga�o, creer que tenemos �xito cuando no lo tenemos.\n" +
                                "   Soledad, necesidad de amigos que nos orienten y apoyen.\n" +
                                "   Necesidad de colaboradores y consejeros para nuestros negocios y proyectos.\n" +
                                "   Proyecto cancelado o postergado.\n"
                + "- Invertida:Alegr�a. Victoria. Satisfacci�n.\n" +
                            "   Logros materiales y felicidad emocional.\n" +
                            "   Confianza en uno mismo.\n" +
                            "   Crecimiento en todas las �reas de la vida, madurez.\n" +
                            "   Etapa dorada de una relaci�n, matrimonio o emparejamiento como culminaci�n de una relaci�n.\n" +
                            "   Maternidad deseada que por fin se realiza.\n" +
                            "   Buenos amigos, familia cari�osa y c�lida.\n" +
                            "   Exito por el que se ha trabajado mucho.\n" +
                            "   Obra art�stica que materializa una gran inspiraci�n.\n" +
                            "   Libertad, liberaci�n, sobre todo a nivel espiritual.";
        signi[20] ="[El Juicio]\n"
                + "- Normal: Recompensa por nuestros actos.\n" +
                                    "   Recogemos lo que sembramos.\n" +
                                    "   Comportamiento correcto que recibe premio.\n" +
                                    "   Desaf�o que afrontaremos con �xito.\n" +
                                    "   Renacimiento, resurrecci�n espiritual despu�s de una �poca dif�cil.\n" +
                                    "   Liberaci�n.\n" +
                                    "   Elevaci�n espiritual.\n" +
                                    "   Llamada vocacional o espiritual que debemos escuchar, momento decisivo, cambio de vida.\n" +
                                    "   Posible juicio legal que se afrontar� con �xito.\n" +
                                    "   Superaci�n de pruebas.\n" +
                                    "   Eliminaci�n de restricciones y obst�culos.\n"
                + "- Invertida:Recogemos las consecuencias de actos negativos.\n" +
                            "   Deuda k�rmica que hay que pagar.\n" +
                            "   Exceso de cosas que no funcionan en nuestra vida.\n" +
                            "   Indecisi�n, incapacidad de tomar decisiones correctas o de escuchar la llamada de nuestro interior.\n" +
                            "   Momento de dejar cosas atr�s y de liberarse de restricciones.\n" +
                            "   Problemas legales. ";
        signi[21] ="[El Mundo]\n"
                + "- Normal:Cumplimiento de deseos y objetivos.\n" +
                                "   Realizaci�n y culminaci�n de proyectos.\n" +
                                "   Comprensi�n plena de la lecci�n que implica cada una de nuestras experiencias negativas.\n" +
                                "   Libertad absoluta para obrar, madurez plena e independencia.\n" +
                                "   Capacidad de ense�ar a otros gracias a nuestras experiencias.\n" +
                                "   Ascenso en el trabajo o cambio a otra carrera m�s gratificante.\n" +
                                "   Conciencia c�smica.\n" +
                                "   Viajes, sobre todo viajes muy deseados.\n"
                + "- Invertida:Inercia, falta de �nimo, falta de energ�a, debilidad.\n" +
                            "   Incapacidad de aprender de nuestras experiencias.\n" +
                            "   Falta de visi�n de futuro.\n" +
                            "   Miedo al cambio.\n" +
                            "   Necesidad de trabajar m�s para llegar a nuestros proyectos\n" +
                            "   Obst�culos que ponemos nosotros mismos o nos ponen otros,Decepci�n.";

              System.out.println(
"                                                           __^__                                      __^__\n" +
"                                                          ( ___ )------------------------------------( ___ )\n" +
"                                                           | / |                                      | / |\n" +
"                                                           | / |     Bienvenido al Tarot Virtual      | / |\n" +
"                                                           |___|                                      |___|\n" +
"                                                          (_____)------------------------------------(_____)"); 
        //Repetir menu
         do{      
        
              System.out.println("�Que desea saber?"); 
              System.out.println("Menu:");
                            System.out.println("\n");
                System.out.println("1-Tirada Simple: \nEl pasado\n" +
                "El presente\n" +
                "El futuro.");
                            System.out.println("\n");
                System.out.println("2-La Cruz Simple: \n1: estado actual del consultante, su situaci�n, sus problemas.\n" +
                "2: mundo exterior, lo que rodea al consultante y c�mo influye en su estado actual.\n" +
                "3: sentimientos, estado de �nimo, pensamientos, ideas, opiniones, yo interior del consultante relacionado con su situaci�n.\n" +
                "4: desenlace, destino, soluci�n a su situaci�n.");
                            System.out.println("\n");
                System.out.println("3-Tirada R�pida:\nLas cartas centrales\n" +
                "(2 y 5), resultado final.\n" +
                "La hilera superior\n" +
                "(1,2 y 3) Futuro pr�ximo.\n" +
                "La hilera inferior\n" +
                "(4, 5 y 6) futuro lejano.\n" +
                "(5 y 6) sucesos inesperados u obstaculos.\n" +
                "(1 y 4) influencias beneficiosas y pr�cticas");
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
                System.out.println("Ha elegido la Tirada R�pida:");
                                System.out.println("	  __^__                                      __^__\n" +
                                               "         ( ___ )------------------------------------( ___ )\n" +
                                               "          | / |                                      | / |\n" +
                                               "          | / |           Tirada R�pida              | / |\n" +
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

