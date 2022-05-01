# Práctica Multi-Hilos Line up
![line-wall](/5-Line%20up/Diagrama/line-wall.jpg)

En esta práctica se modelo el comportamiento de un concierto donde participan 3 artistas, los cuales se crearon sus clases correspondientes
([The Weeknd](/5-Line%20up/src/Weeknd.java), [Post Malone](/5-Line%20up/src/Malone.java) y
[Kanye West](/5-Line%20up/src/Ye.java)) que extienden de la clase [Artist Performance](/5-Line%20up/Diagrama/ArtistPerformance.java) e implementan cada una su 
interface ([The Weeknd](/5-Line%20up/src/WeekndActions.java), [Post Malone](/5-Line%20up/src/ShowMalone.java), [Kanye West](/5-Line%20up/src/YeActions.java)), 
cuando se ejecuta el programa una ventana te pregunta que artista quieres que comience el concierto y cada artista interpreta 2 canciones.
Para esto se crearon se crearon 6 hilos, 3 donde se ponia el orden de los artistas y otros 3 donde se ponia su pirotecnia de cada orden, esta pirótecnia sólo aparece cuando comienza
una canción.


## Ejecución

video de la ejecución [aqui](https://vimeo.com/704985709)


## Diagrama
![coachella-diagrama](/5-Line%20up/Diagrama/Diagram.png)

**Nota**

Para que la práctica funcione se tienen que agregar los respectivos gifs y archivos mp3 en la carpeta del proyecto
