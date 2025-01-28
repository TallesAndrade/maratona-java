### Como funciona o java

![img.png](img.png)
O processo funciona basicamente quando é escrito um codigo java vem o compilador JAVAC e transforma o arquivo .java em um .class bytecode
que é oque o JVM(Java Virtual Machine) interpreta para o computador idependente do sistema operacional, ambos compilador e interpretador vem
no JDK.

- Pasta **"out"** na IDE: Aonde fi .clcam os arquivos compilados paraass em bytecode.

### Tipos primitivos

São tipos que irão guardar em memoria um valor simples      

![img_2.png](img_2.png)

O byte ocupa 1 byte de memória, ou seja, 8 bits. Em termos binários, 8 bits podem ser representados como 1111 1111, que equivale ao valor 255 em decimal ou FF em hexadecimal.

No entanto, como o tipo byte em Java é assinado (pode armazenar números negativos e positivos), a faixa de valores vai de -128 até 127. Isso ocorre porque a metade dos 256 possíveis valores (de 0 a 255) é usada para números negativos (de -128 a -1), enquanto a outra metade é usada para números positivos (de 0 a 127).

Portanto, o intervalo total é: -128 (valor mais baixo) a 127 (valor mais alto), somando-se os 256 valores possíveis no total.

String não é um tipo primitivo é uma classe.

 ### Operadores
##### Aritimeticos
+ Soma = "+"
+ Subtração = "-"
+ Multiplicação = "*"
+ Divisão = "/" 
+ %\
O resultado de uma operação de numeros inteiros sempre irão retornar numeros inteiros

##### Relacionais

< > <= >=  == !=

Retornam apenas valores booleanosdo
