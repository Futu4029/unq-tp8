# UNQ-TP8 Test y test doubles.

<B>
<ol>Explique y desarrolle el significado de los siguientes postulados de TDD y Test de Unidad.
<li>Mantener en forma exhaustiva una suite de tests.</li>
<li>No deben utilizarse para testear otros objetos del dominio.</li>
<li>Comunicar la intenci�n del test.</li>
</B>
</ol>

<ol>
<li>Quiere decir testear cada uno de los puntos a desarrolar como un conjunto. </li>
<li>Separar los test seg�n lo testeado. Es decir en un mismo test no aplicar las verificaciones a m�s de un m�todo. Los test segmentados son m�s eficases y promueven una buena pr�ctica</li>
<li>Como parte de las buenas pr�cticas los test deben ser claros, precisos y se deben utilizar notas para resolver cualquier posible malinterpretaci�n. Las buenas pr�cticas conllevan tambi�n que nuestros test no sean the smellies ones, o mejor dicho aquellos que no se entienden, o son muy largos, o muy cortos o tratan de abarcar muchos m�todos.</li>
</ol>
<b>Mockito
Instal� el framework para mock objects Mockito (http://site.mockito.org) y resuelva las siguientes consignas:
<ol>
<li>Implementar los test del ejercicio anterior (verificar con 5 Cartas) utilizando mockito.</li>
<li>�C�mo se indica en mockito que el objeto mock debe recibir un secuencia de mensajes particular en un orden 
preestablecido? Agregue un ejemplo.</li>
<li>�C�mo hacer para que un objeto mock este preparado para recibir algunos mensajes sin importar el orden o la 
obligatoriedad de recibirlos? Agregue un ejemplo.</li>
<li>Es posible anidar env�o de mensajes con mockito. Si es posible, como se hace.</li>
<li>�Como es la forma de verificaci�n con mockito?</li>
</b></ol>

<ol>
<li>Done</li>
<li>Con el mensaje inOrder se puede ir definiendo el orden en que los mensajes tienen que ser recibidos 
<p>inOrder().verify(MyMock).MyMessage()</p></li>
<li>Simplemente sacandole el mensaje inOrder previamente
<p>verify(MyMock).MyMessage()</p></li>
<li>Es posible ---</li>
<li>Con el mensaje verify, esta implementado en el archivo PokerMokito.java</li>
</ol>


<b>Test Doubles</b>
<ol><b><li>�Qu� son los test doubles?</li>
<li>Enumere los tipos de test doubles y de ejemplos concretos de uso. Indique como usar�a, cuando es posible,
mockito para emular los diferentes tipos de tipos de test doubles.</li></b></ol>

<ol>
<li>Los test doubles son objetos que simulan ser DOCs, tienen las mismas cualidades y responden de la manera que necesitamos para comprobar el funcionamiento del SUT</li>
<li>Tenemos 4 tipos: Dummy, Stub, Spy y Mock
<p><b>DUMMY:</b> Se utiliza como un objeto de relleno. En este caso se podr�a utilizar para las cartas que no suman nada a las jugadas. Es decir de un p�ker la 5ta carta, sin esta carta no tendr�a una mano, pero sin embargo no se le da uso.</p>
<p><b>STUB:</b> Por ejemplo se podr�a utilizar para estimular a que las jugadas sean las mismas y ver si el SUT responde de la forma esperada.</p>
<p><b>SPY:</b> Se utiliza para registrar outputs indirectos. Por ejemplo si yo le mando un mensaje a un objeto, podemos registrar un mensaje o registro que este objeto genera cada vez que se le manda dicho mensaje y que permanece oculto para el que origin� el mensaje. De esta manera podemos observar comportamientos que suelen estar dentro de "la caja negra"</p>
<p><b>MOCK:</b> tiene un comportamiento similar a cualquier DOUBLE pero se puede verificar a si mismo. Se podr�a utilizar en cualquier situaci�n, pero con la capacidad de devolver una verificaci�n de si se recibieron mensajes.</p>
<p>Utilizar�a mockito para testear si todos los mensajes llegan a destino, donde esta la falla o cuantos mensajes recibe un objeto.</p></li>
</ol>