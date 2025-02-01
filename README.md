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

Retornam apenas valores booleanos

##### Operadores Logicos

+ &&(AND) ||(OR) !(NOT)

##### Operadores Atribuição
 
= += -= *= /= ++ --\
Adicionar o incrementador antes da variavel adiona o valor antes e após incrementa o valor que ela tem.

##### Estruturas Condicionais
Todos os valores dentro do if só sera executada ser for booleana, e true.
Todas a vezes que a primeira validadação do if for false ele executa o else.
Else if é uma validação intermediaria quando se tem mais de 2 opçoes.
            
Operador ternario

        //(condicao) ? verdadeiro : falso

##### Estruturas de Repetição

+ While
O valor de dentro sempre tem que ser um boolean e incrementado dentro do loop, se não roda infinito.
+ Do-While
Funciona como o while com a diferença que sempre será executado ao menos uma vez, e a verificação da condição é feita ao final do loop.
+ For
Todas a regras para fazer o loop são dadas no inicio, o valor incial do contador a verificação da condição e o incremento da variavel que roda o loop.