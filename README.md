# Repositório de Estudos Java — Quitação de Débitos Técnicos

Este repositório tem como objetivo quitar débitos técnicos em Java, reforçando os fundamentos da linguagem por meio de anotações, exemplos e testes práticos. Ele serve como base de consulta e revisão contínua para consolidar o conhecimento adquirido.

---


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

##### Arrays
Um array em Java é uma estrutura de dados que armazena uma sequência de valores do mesmo tipo e é uma variavel do tipo referencia.
É uma variável que armazena o endereço de um objeto na memória, em vez do próprio objeto.
Arrays são estaticos, após a inicialização dele ele sempre vai ter o mesmo numero de valores para preencher.
##### Arrays Multidimencionais
Arrays Multidimencionais são arrays dentro de arrays, int[ ][ ] dias = new int[2][2]
no exemplo de um array multidimencional teremos 3 arrays com 3 posições e cada array.
![img_1.png](img_1.png)

###### Garbage Collector
É Um mecanismo no Java que gerencia a memoria, reponsavel por liberar a memoria que não esta sendo mais referenciada no codigo.

### Orientação Objetos
##### Introdução classes

Orientação a objetos (POO) é um paradigma de programação que estrutura o código em torno de objetos que representam entidades do mundo real.
A POO permite: Modularizar o código, Reutilizar código, Desenvolver sistemas complexos, Aproximar o real e o virtual, Visualizar o que está sendo criado. 
![img_3.png](img_3.png)

A imagem acima representa a criação de dois objetos pessoas a partir de uma classe Pessoa, a classe é uma "forma" aonde é passa as caracteristicas
e atributos. Não possuem o psvm já que são classes de dominio, algo que representa o mapeamento do mundo real.
##### Coesão
Coesão em Java significa que cada classe deve ser responsável por um único objetivo, sem misturar funcionalidades de outras áreas. Isso torna o código mais organizado, claro e fácil de manter, pois cada classe tem uma função bem definida e focada em um único propósito.
##### Variaveis de referencia
Em Java, variáveis de referência armazenam o endereço de memória de um objeto, e não o objeto em si. Isso significa que elas apontam para a localização onde o objeto está armazenado, e qualquer alteração feita no objeto afetará todas as variáveis que referenciam esse mesmo objeto, já que todas compartilham o mesmo endereço de memória. Esses objetos são alocados na memória heap, que é a área destinada à alocação dinâmica de objetos durante a execução do programa. Quando você cria um objeto usando o operador new, ele é armazenado na heap, onde pode permanecer enquanto houver referências apontando para ele. A memória na heap pode crescer conforme necessário, e a gerência de memória dessa área é feita pelo garbage collector (coletor de lixo), que automaticamente libera a memória de objetos que não têm mais referências, evitando vazamentos de memória. A heap oferece flexibilidade e permite a alocação de objetos de tamanho variável, mas a sua administração é mais complexa em comparação com a memória da pilha.
##### Metodos
Métodos em Java são blocos de código dentro de uma classe que executam uma tarefa específica. Eles permitem que o código seja organizado e reutilizado, evitando a repetição de tarefas. Ao criar um método, você define um nome e um conjunto de instruções que serão executadas sempre que o método for chamado. Isso facilita a estruturação do programa, tornando-o mais modular e legível. Os métodos podem ser chamados de outras partes do código para realizar a funcionalidade que foi definida, ajudando a manter o programa mais limpo e eficiente.
+ Parâmetros\
Parâmetros são valores que você pode passar para um método quando o chama, permitindo que o método trabalhe com dados específicos. Eles são definidos na declaração do método e servem para fornecer informações que o método pode usar para realizar sua tarefa. Parâmetros tornam os métodos mais flexíveis, pois permitem que o mesmo método execute operações diferentes dependendo dos valores que são passados para ele. Em Java, os parâmetros podem ser de qualquer tipo de dado, incluindo tipos primitivos, objetos ou até mesmo arrays, e são importantes para a personalização do comportamento do método.
+ Retorno\
O return em Java é uma palavra-chave usada para finalizar a execução de um método e, opcionalmente, retornar um valor. Em métodos que retornam um valor (como int, String, etc.), o return deve ser seguido por uma expressão que corresponda ao tipo do valor esperado pelo método, como em return a + b;. Já em métodos void (que não retornam valor), o return pode ser utilizado apenas para finalizar o método antecipadamente, como em return;. Essa palavra-chave é essencial para controlar o fluxo de execução e para devolver resultados entre os métodos.
+ Parâmetros Tipos Primitivos\
Em Java, os parâmetros de tipos primitivos são passados por valor, ou seja, o valor da variável é copiado para o método, e qualquer alteração dentro do método não afeta a variável original. Os tipos primitivos incluem int, double, float, char, boolean, byte, short e long. Ao passar esses tipos como parâmetros, o método recebe uma cópia do valor, o que significa que alterações no método não impactam a variável original.
+ Parâmetros Tipos Referencia\
  Em Java, os parâmetros de tipo referência são usados para objetos e são passados por referência. Isso significa que, ao invés de copiar o valor do objeto, o método recebe uma referência para o objeto original, permitindo que qualquer alteração no objeto dentro do método afete o objeto original. Exemplos de tipos de referência incluem classes, arrays e interfaces. Como resultado, mudanças feitas em um objeto dentro de um método refletem diretamente no objeto passado como argumento.
+ Referência this\
  Em Java, a palavra-chave this refere-se à instância atual de uma classe, ou seja, ao objeto que invocou o método ou construtor. É comumente usada para diferenciar variáveis de instância de parâmetros ou outras variáveis locais com o mesmo nome. Também pode ser usada para chamar outros construtores da mesma classe. Exemplo: this.nome = nome; define o valor da variável de instância nome com o valor do parâmetro nome. O this é essencial para acessar membros da classe e evitar ambiguidade em casos de nomes semelhantes.
+ Varargs
  Em Java, varargs (argumentos variáveis) permitem passar um número variável de argumentos para um método, utilizando três pontos (...) antes do tipo do parâmetro. O varargs é tratado como um array dentro do método e deve ser o último parâmetro na lista. Ele facilita a passagem de múltiplos parâmetros sem a necessidade de sobrecarga de métodos ou criação manual de arrays. Por exemplo, você pode criar um método como imprimirNumeros(int... numeros), que pode ser chamado com qualquer número de argumentos, como imprimirNumeros(1, 2, 3) ou imprimirNumeros(), tornando o código mais flexível e conciso.
##### Modificador de acesso private, get e set
O modificador de acesso private em programação orientada a objetos é utilizado para restringir o acesso a atributos e métodos de uma classe, permitindo que esses membros sejam acessados apenas dentro da própria classe. Para acessar ou modificar esses atributos de fora da classe, é comum utilizar os métodos get e set. O método get permite recuperar o valor de um atributo privado, enquanto o set é utilizado para modificar esse valor. Essa prática garante o encapsulamento, proporcionando maior controle sobre os dados e a lógica de negócios da aplicação, além de evitar alterações inesperadas nos atributos diretamente.
##### Sobrecarga de Métodos
A sobrecarga de métodos em Java permite definir vários métodos com o mesmo nome, desde que tenham assinaturas diferentes (quantidade ou tipo de parâmetros). Além disso, um método sobrecarregado pode chamar outro método dentro da mesma classe, até mesmo com um nome diferente, permitindo reutilizar código e evitar repetições, tornando a implementação mais eficiente e organizada.
##### Contrutores
Quando um objeto é criado em Java, um construtor é sempre invocado para inicializá-lo. Se não houver um construtor explícito definido na classe, o Java automaticamente cria um construtor vazio, sem parâmetros, para garantir que o objeto seja inicializado com valores padrão. No entanto, se você definir um construtor com parâmetros, ele permite que o objeto seja criado com valores específicos passados no momento da instância. Nesse caso, o construtor vazio não é gerado automaticamente, e você precisará usar o construtor parametrizado para inicializar o objeto com dados personalizados. Portanto, dependendo da definição dos construtores, você pode controlar como os objetos são inicializados, seja de forma padrão ou com valores fornecidos.
A sobrec arga de construtor ocorre quando uma classe tem múltiplos construtores com o mesmo nome, mas com diferentes listas de parâmetros. Isso permite criar objetos de diferentes maneiras, dependendo dos parâmetros passados durante a criação. Por exemplo, uma classe pode ter um construtor sem parâmetros, outro com um parâmetro e até mesmo outro com múltiplos parâmetros, oferecendo flexibilidade na inicialização dos objetos. A sobrecarga de construtores é útil quando você deseja fornecer diferentes formas de inicializar um objeto, sem precisar criar múltiplos nomes para os construtores, simplificando o código e mantendo a clareza. O Java escolhe qual construtor usar com base nos tipos e na quantidade de argumentos fornecidos no momento da criação do objeto
##### Bloco de Inicialização
Existem dois tipos principais de blocos de inicialização em Java:

###### 1. Bloco de Inicialização de Instância

- **Quando é executado:** Sempre que um **objeto** da classe é criado.
- **Como funciona:** É executado **antes** do construtor, ou seja, logo após a criação do objeto e antes da execução do código do construtor.
- **Objetivo:** Inicializar variáveis de instância ou realizar outras operações que precisam ser feitas antes do construtor ser executado.

2. Bloco de Inicialização Estático

- **Quando é executado:** Apenas **uma vez**, quando a classe é carregada pela primeira vez pela JVM.
- **Como funciona:** É associado à **classe** e não a objetos individuais. É executado **antes** de qualquer instância da classe ser criada.
- **Objetivo:** Inicializar variáveis estáticas ou realizar operações que devem ocorrer uma única vez, como configurar recursos compartilhados ou fazer inicializações globais.

---

##### Resumo

- **Bloco de Inicialização de Instância:** Inicializa cada objeto individualmente e é executado toda vez que um novo objeto é criado.
- **Bloco de Inicialização Estático:** Inicializa a classe como um todo e é executado apenas uma vez, quando a classe é carregada.

##### Modificador `static` - Variáveis Estáticas

###### O que são variáveis estáticas?
Uma variável declarada como `static` pertence à classe em vez de pertencer a instâncias individuais. Isso significa que seu valor é compartilhado entre todas as instâncias da classe, e ela é inicializada apenas uma vez, na primeira utilização da classe.

###### Características das variáveis estáticas:
- São compartilhadas por todas as instâncias da classe.
- Podem ser acessadas diretamente pelo nome da classe (`Classe.variavel`).
- São inicializadas uma única vez, quando a classe é carregada na memória.
- Mantêm seu valor entre diferentes instâncias da classe.


###### Quando usar variáveis estáticas?
- Para definir constantes (`static final`), como `public static final double PI = 3.14;`
- Para contadores ou valores que devem ser compartilhados entre todas as instâncias da classe.
- Para cache de valores que não precisam ser recalculados repetidamente.

###### Observações
- O uso excessivo de variáveis estáticas pode tornar o código menos flexível e dificultar testes.
- Em aplicações multithread, deve-se ter cuidado ao modificar variáveis estáticas, pois elas podem ser acessadas simultaneamente por várias threads.

##### Métodos Estáticos

###### O que são Métodos Estáticos?
Os métodos estáticos pertencem à classe e não a uma instância específica da classe. Isso significa que eles podem ser chamados sem precisar criar um objeto.

###### Características dos Métodos Estáticos:
- São definidos com a palavra-chave `static`.
- Não podem acessar diretamente atributos de instância da classe.
- Só podem chamar outros métodos estáticos diretamente.
- São geralmente utilizados para operações que não dependem de instâncias específicas.



###### Quando Usar Métodos Estáticos?
- Para operações utilitárias (ex: `Math.pow()`, `Math.sqrt()`).
- Quando o método não depende de atributos de instância.
- Para criar fábricas de objetos (`factory methods`).
- Métodos auxiliares em classes de serviço.

###### Restrições dos Métodos Estáticos:
- Não podem usar `this` ou `super`, pois não pertencem a uma instância específica.
- Não podem ser sobrescritos (`override`), mas podem ser redefinidos em subclasses com um novo método estático.

###### Conclusão
Métodos estáticos são uma ferramenta poderosa para organizar código reutilizável e funções auxiliares. No entanto, devem ser usados com cautela para evitar dependências globais excessivas.

##### Associação

+ Arrays com objetos\
Arrays com objetos em programação referem-se a estruturas de dados que combinam a capacidade de armazenar múltiplos elementos, como um array tradicional, mas com a diferença de que cada elemento pode ser um objeto, ou seja, uma instância de uma classe contendo atributos e métodos. Essa abordagem permite organizar e manipular dados mais complexos de forma eficiente, agrupando informações relacionadas em um único conjunto. Usar arrays de objetos facilita a representação de entidades no mundo real, como clientes, produtos ou transações, com cada objeto mantendo suas propriedades e comportamentos específicos dentro da coleção.
+ Associação unidirecional um para muitos
  Associação unidirecional um para muitos é um tipo de relacionamento entre duas entidades, onde uma instância de uma classe (a classe "um") está associada a várias instâncias de outra classe (a classe "muitos"), mas a relação é unidirecional, ou seja, apenas a classe "um" tem conhecimento da classe "muitos". Um exemplo comum disso seria uma situação em que uma classe "Autor" pode estar associada a várias instâncias da classe "Livro", mas os objetos da classe "Livro" não sabem qual é o "Autor" correspondente a eles. Esse tipo de associação é utilizado para representar situações em que uma entidade pode ter múltiplos associados, mas a navegação na relação acontece apenas de um lado.
+ Associação unidirecional muitos para um

A Associação Unidirecional Muitos para Um (também conhecida como 1:N) é um tipo de relacionamento entre duas entidades, onde uma instância de uma entidade pode estar associada a várias instâncias de outra, mas a relação é unidirecional. Isso significa que uma entidade "muitas" pode se referir a uma única entidade "um", mas a entidade "um" não tem conhecimento das múltiplas entidades associadas a ela. Esse tipo de associação é comum em bancos de dados e modelos de dados, onde, por exemplo, um cliente pode ter muitos pedidos, mas cada pedido está associado a um único cliente.
+ Associação Bidirecional em Java 

A associação bidirecional é um tipo de relacionamento entre duas classes onde cada uma mantém uma referência à outra, permitindo navegação nos dois sentidos. Esse tipo de associação é útil quando é necessário que ambas as entidades envolvidas tenham conhecimento uma da outra e possam acessar seus dados diretamente. No entanto, é importante gerenciar corretamente essa relação para evitar referências circulares e problemas de consistência nos dados.

##### Entrada de dados
Em Java, a entrada de dados pode ser realizada de várias formas, sendo a mais comum através da classe Scanner, que permite ler dados do console. Para utilizar, é necessário importar a classe com import java.util.Scanner; e criar um objeto Scanner para capturar entradas como texto, números inteiros, decimais, entre outros. Exemplos de métodos incluem nextLine() para strings, nextInt() para inteiros e nextDouble() para números de ponto flutuante. Após a leitura, é importante fechar o objeto Scanner com scanner.close() para liberar recursos.
##### Herança
+ Em Java, a herança é implementada com a palavra-chave extends, permitindo que uma classe filha herde todos os atributos da classe mãe, exceto os privados. Isso promove a reutilização de código e facilita a organização do projeto. Como todas as classes herdam, direta ou indiretamente, da classe Object, elas também possuem características comuns da linguagem.
+ Em Java, a palavra-chave super é usada para acessar membros da classe mãe. Pode ser utilizada para chamar um construtor da superclasse (super()) ou para acessar atributos e métodos herdados que foram sobrescritos na classe filha. Isso permite reutilizar a lógica da classe mãe e evitar a repetição de código.
+ O modificador de acesso protected em Java permite que um atributo ou método seja acessado por classes do mesmo pacote e por subclasses, mesmo que estejam em pacotes diferentes. Ele oferece um meio-termo entre private (acesso restrito à própria classe) e public (acesso livre a todas as classes), sendo útil para herança ao permitir que classes filhas utilizem membros da classe mãe sem expô-los completamente.
+ Em Java, quando uma classe filha é instanciada, o construtor da classe mãe é chamado primeiro, garantindo que seus atributos sejam inicializados antes dos da classe filha. Isso acontece automaticamente, mas pode ser explicitamente definido com super(). Se a classe mãe tiver um construtor com parâmetros, a classe filha deve chamá-lo passando os valores necessários. Além disso, como todas as classes herdam de Object, se nenhuma superclasse for especificada, o construtor padrão de Object será chamado implicitamente.
+ Na herança, a sequência de inicialização em Java segue uma ordem específica: primeiro, os atributos estáticos da superclasse são inicializados, depois os atributos estáticos da subclasse. Em seguida, a instância da superclasse é criada, executando primeiro os atributos de instância e o construtor da superclasse. Só depois a instância da subclasse é inicializada, seguindo a mesma ordem. Isso garante que a classe mãe esteja totalmente configurada antes da classe filha ser criada.

##### Sobrescrita do método toString

A sobrescrita do método toString() em Java permite personalizar a representação textual de um objeto. Por padrão, toString() vem da classe Object e retorna o nome da classe seguido do código hash do objeto. Ao sobrescrevê-lo em uma classe, é possível definir um retorno mais legível, como os valores dos atributos. Isso é útil para depuração e exibição de informações.

##### Modificador final

+ Tipo Primitivo
  Em Java, o modificador final em tipos primitivos impede que a variável tenha seu valor alterado após a atribuição. Quando combinado com static, a variável se torna uma constante associada à classe, e não a instâncias individuais. Isso é útil para definir valores fixos compartilhados, como public static final double PI = 3.14159;, garantindo que o valor seja imutável e acessível sem a necessidade de criar um objeto.
+ Tipo Referência
  Em Java, quando o modificador final é aplicado a uma variável de tipo referência, ele impede que a variável aponte para outro objeto, mas não bloqueia a modificação dos atributos do objeto referenciado. Ou seja, após a atribuição inicial, a referência não pode ser alterada, mas o conteúdo interno pode ser modificado. Esse comportamento é útil para garantir que um objeto específico seja sempre o mesmo, sem impedir sua manipulação.
+ Classes e metodos
  Em Java, o modificador final pode ser aplicado a classes e métodos para restringir herança e sobrescrita. Quando uma classe é marcada como final, ela não pode ser estendida, garantindo que sua implementação permaneça inalterada. Já quando um método é final, ele pode ser herdado, mas não sobrescrito pelas subclasses, protegendo a lógica original. Isso é útil para manter a segurança e integridade do código em determinadas situações.

##### Enum

+ Em Java, a enumeração (enum) é um tipo especial usado para representar um conjunto fixo de constantes. Definida com a palavra-chave enum, ela permite organizar valores que possuem um significado semântico, como dias da semana ou status de pedidos. Além de armazenar constantes, um enum pode ter atributos, métodos e até mesmo construtores, tornando-se uma estrutura poderosa para representar estados no código.

+ Em Java, um enum pode ter construtores e atributos para associar valores específicos a cada constante. Cada item do enum pode receber parâmetros na sua definição, que são então passados para o construtor. Esse construtor deve ser private, pois os enums são instâncias únicas e gerenciadas automaticamente pelo Java. Os valores atribuídos podem ser armazenados em atributos final e acessados por meio de métodos. Isso torna os enums mais flexíveis, permitindo representar estados ou categorias com dados adicionais.
+ Em Java, um enum pode sobrescrever métodos, permitindo comportamentos específicos para cada constante. Isso é feito implementando métodos diretamente no enum ou usando blocos anônimos para sobrescrever métodos individuais. Como os enums são classes especiais, também podem sobrescrever métodos herdados de Enum, como toString(), para personalizar a exibição das constantes. Essa flexibilidade permite criar enumerações mais dinâmicas e adaptáveis dentro do código.
+ Em Java, é possível buscar um enum com base em seus atributos, permitindo localizar uma constante específica conforme seu valor associado. Isso é feito percorrendo todas as instâncias com values() e comparando o atributo desejado. Outra abordagem eficiente é armazenar os valores em um Map estático para acesso rápido. Esse recurso torna os enums mais flexíveis e úteis em situações onde é necessário mapear dados de forma eficiente.

##### Classes Abstradas

+ Em Java, uma classe abstrata é uma classe que não pode ser instanciada diretamente e serve como modelo para outras classes. Declarada com a palavra-chave abstract, ela pode conter métodos concretos (com implementação) e métodos abstratos (sem corpo), que devem ser obrigatoriamente implementados pelas subclasses. Isso permite definir um comportamento base e garantir que as classes filhas sigam uma estrutura específica.
+ Em Java, um método abstrato é um método declarado em uma classe abstrata sem implementação, usando a palavra-chave abstract. Ele deve ser obrigatoriamente sobrescrito por qualquer classe concreta que estenda a classe abstrata. Isso garante que cada subclasse forneça sua própria implementação, promovendo um contrato comum entre as classes e permitindo maior flexibilidade no design do código.
+ Em Java, métodos abstratos seguem algumas regras importantes. Eles só podem existir dentro de classes abstratas e não podem ter corpo, ou seja, apenas sua assinatura é declarada. Qualquer classe concreta que herde uma classe abstrata deve obrigatoriamente sobrescrever todos os seus métodos abstratos, a menos que também seja abstrata. Além disso, métodos abstratos não podem ser static, final ou private, pois essas restrições impediriam a sobrescrita nas subclasses.

##### Interfaces

+ Em Java, uma interface é um tipo especial que define um conjunto de métodos que uma classe deve implementar. Declarada com a palavra-chave interface, ela não pode ter instâncias e, por padrão, seus métodos são public e abstract. Uma classe pode implementar múltiplas interfaces, permitindo herança múltipla de comportamentos. Além disso, interfaces podem conter métodos default e static com implementação, tornando-as mais flexíveis para evolução do código.

+ Em Java, uma classe pode implementar múltiplas interfaces, permitindo herdar comportamentos de diferentes fontes. Isso é feito usando a palavra-chave implements, seguida de uma lista de interfaces separadas por vírgula. Como as interfaces apenas definem métodos sem implementação (exceto default e static), a classe deve fornecer a lógica para todos os métodos exigidos. Essa abordagem permite um design mais modular e evita as limitações da herança única das classes.

+ Em Java, interfaces podem conter atributos e métodos estáticos. Os atributos em interfaces são sempre public, static e final, funcionando como constantes globais. Já os métodos static possuem implementação e pertencem à interface, podendo ser chamados diretamente sem precisar de uma instância. Isso permite definir comportamentos utilitários relacionados à interface, sem a necessidade de uma classe auxiliar.

##### Polimorfismo

+ Em Java, o polimorfismo permite que um mesmo método tenha diferentes comportamentos dependendo do objeto que o invoca. Ele se divide em polimorfismo de compilação (sobrecarga de métodos) e de execução (sobrescrita de métodos). Isso promove flexibilidade e reutilização de código, permitindo que objetos de diferentes classes sejam tratados de forma genérica por meio de referências de uma superclasse ou interface.
+ O polimorfismo em Java permite que um objeto de uma classe filha seja referenciado por uma variável da superclasse ou de uma interface, como em Produto produto = new Computador();. Isso significa que, embora o objeto seja uma instância de Computador, ele pode ser tratado como um Produto, permitindo maior flexibilidade no código. Esse conceito possibilita que métodos sobrescritos sejam chamados dinamicamente conforme o tipo real do objeto em tempo de execução, facilitando a reutilização e a extensibilidade do sistema sem modificar sua estrutura principal.
+ Em Java, parâmetros polimórficos permitem que um método receba como argumento uma referência de uma superclasse ou interface, possibilitando que diferentes subclasses sejam passadas sem precisar de sobrecarga. Isso aumenta a flexibilidade do código, pois um único método pode processar vários tipos de objetos que compartilham um comportamento comum. Dessa forma, o polimorfismo facilita a generalização de operações e reduz a necessidade de múltiplas implementações específicas.
+ Em Java, o operador instanceof verifica se um objeto é uma instância de uma classe específica ou implementa uma interface, garantindo segurança antes de realizar um cast. O casting converte um objeto de um tipo mais genérico para um tipo mais específico, permitindo acessar métodos exclusivos da subclasse. O downcasting (Superclasse referencia = new Subclasse(); Subclasse obj = (Subclasse) referencia;) deve ser feito com cautela, pois um cast incorreto pode gerar exceções em tempo de execução.
+ A programação orientada a interface, dentro do conceito de polimorfismo, consiste em utilizar interfaces como tipos de referência para objetos, permitindo que diferentes implementações sejam intercambiáveis. Em vez de depender diretamente de classes concretas, o código trabalha com interfaces, como em Dispositivo dispositivo = new Impressora();. Isso promove desacoplamento, facilitando a manutenção, a substituição de implementações e a aplicação de princípios como a inversão de dependência, tornando o sistema mais flexível e extensível.

##### Exception

###### Introdução às Exceções

+ Exceções são situações inesperadas que podem ocorrer durante a execução de um programa.

+ Algumas exceções podem ser tratadas, enquanto outras estão fora do controle do programador.

###### Tipos de Exceções

+ Algumas exceções podem ser tratadas, como divisão por zero.

+ Outras exceções, como problemas de permissão ao acessar arquivos ou falhas de conexão com banco de dados, não podem ser controladas diretamente.

+ É importante estar preparado para lidar com exceções, pois são inevitáveis em sistemas complexos.

###### Classificação de Erros e Exceções no Java

+ No Java, exceções pertencem à classe Exception.

+ Erros mais críticos são representados pela classe Error.

+ Erros como OutOfMemoryError indicam problemas graves e geralmente não podem ser recuperados.

###### Tratamento de Erros

+ Quando um erro ocorre, a execução do programa é interrompida.

+ Para continuar a execução, é necessário corrigir o problema e reiniciar o sistema.

+ O StackOverflowError acontece quando um método recursivo é chamado indefinidamente sem um critério de parada.

###### Exemplo Prático de Recursividade

+ Um método recursivo sem condição de término pode causar StackOverflowError.

+ Ao chamar repetidamente o mesmo método sem um critério de parada, a memória se esgota, resultando em erro.

###### RuntimeException

- **Erro**: Em Java, um erro é algo que é "throwable" e é uma subclasse de `Error`. Isso geralmente está relacionado a problemas graves no ambiente de execução, como falhas de memória ou erros internos da JVM, que não devem ser capturados ou tratados pelo desenvolvedor.

- **Exceção**: Uma exceção é lançada por uma classe `Exception` ou qualquer outra que seja uma subclasse dela, permitindo que o desenvolvedor trate essas condições de erro de forma controlada.

##### Tipos de Exceções

Existem dois tipos principais de exceções que podem ser tratadas de maneira distinta:

- **Exceções Checked**: São filhas diretas da classe `Exception` e exigem tratamento explícito. Se uma exceção checked não for tratada, o código não compila. Este tipo de exceção é utilizado quando um erro pode ser esperado e deve ser tratado de maneira apropriada, como falhas de leitura de arquivo ou problemas de rede.

- **Exceções Unchecked**: São filhas da classe `RuntimeException` e não exigem tratamento obrigatório. As exceções unchecked, como `NullPointerException` ou `ArrayIndexOutOfBoundsException`, geralmente indicam falhas de lógica que o desenvolvedor deveria ter evitado, mas não precisam ser capturadas para que o código compile.

###### RuntimeException

As **RuntimeExceptions** são um subtipo das exceções que não precisam ser tratadas obrigatoriamente para que o código compile. Embora sejam tecnicamente exceções, elas são geralmente usadas para representar erros de lógica no código, que, na maioria dos casos, podem ser evitados com melhores práticas de desenvolvimento.

- **Exceções Comuns**: Exemplos de `RuntimeExceptions` incluem:
  - `NullPointerException`: Ocorre quando você tenta acessar um método ou propriedade de uma variável de referência que está `null`.
  - `ArrayIndexOutOfBoundsException`: Acontece quando você tenta acessar um índice que está fora dos limites do array.
  - `ClassCastException`: Levantada quando você tenta fazer um cast (conversão de tipo) de um objeto para um tipo incompatível.

Embora as `RuntimeExceptions` não necessitem de tratamento explícito, elas devem ser evitadas com boas práticas de codificação para garantir que o sistema não falhe inesperadamente.

###### Considerações Finais

Embora as `RuntimeExceptions` sejam tecnicamente exceções, elas não são filhas diretas da classe `Exception`. Isso implica que não são exigidas para serem capturadas ou declaradas. No entanto, quando ocorrem, elas geralmente indicam falhas de desenvolvimento que poderiam ter sido evitadas com um melhor design ou validação de dados.


###### Exceções Verificadas

As **exceções verificadas (Checked Exceptions)** são aquelas que o compilador exige que sejam tratadas explicitamente no código. Elas são filhas diretas da classe `Exception` e diferem dos erros, pois precisam ser capturadas ou declaradas com `throws` para que o programa compile corretamente.

Essas exceções ocorrem em situações previsíveis, como operações de entrada e saída (`IOException`) ou manipulação de banco de dados (`SQLException`). O tratamento adequado dessas exceções evita falhas inesperadas e melhora a robustez do código.

###### Exemplo prático com java.io.File

A classe `Files` fornece métodos para manipulação de arquivos no Java, incluindo o `createTempFile()`, que pode lançar uma `IOException`.

- A `IOException` é uma exceção verificada e, por isso, exige tratamento explícito.
- Como essas operações envolvem o sistema de arquivos, falhas como permissões inadequadas ou espaço insuficiente podem gerar essa exceção.
- Um tratamento adequado evita que o programa quebre inesperadamente e pode fornecer uma resposta mais amigável ao usuário.

###### Tratamento de Exceções com try-catch

O **bloco `try-catch`** é o mecanismo principal para capturar e tratar exceções em Java.

- O **bloco `try`** contém o código que pode gerar uma exceção.
- O **bloco `catch`** captura a exceção e permite que um tratamento adequado seja aplicado, evitando que o programa encerre abruptamente.

É importante capturar exceções específicas sempre que possível, pois isso permite um tratamento mais preciso e melhora a manutenção do código. Capturar exceções genéricas (`Exception`) pode esconder problemas e dificultar a depuração.

###### Evitando erros comuns no catch

O tratamento inadequado de exceções pode levar a problemas no código. Alguns erros comuns incluem:

- **Não deixar o `catch` vazio**: Ignorar a exceção sem qualquer ação pode ocultar problemas e dificultar a identificação da falha.
- **Não incluir lógica de negócio dentro do `catch`**: O bloco `catch` deve ser usado apenas para lidar com a exceção, e não para processar dados ou alterar o fluxo normal do programa.

###### Imprimindo o Stack Trace

O **Stack Trace** é uma ferramenta essencial para depuração. Ele mostra a sequência de chamadas de método que levaram à exceção, facilitando a identificação do problema.

- O método `printStackTrace()` da classe `Throwable` imprime detalhes sobre a exceção no console.
- A leitura do Stack Trace permite identificar a linha exata onde o erro ocorreu e entender o caminho percorrido pelo código até aquele ponto.

###### Exemplo de falha na criação de arquivo

Existe o caso em que a tentativa de criar um arquivo falha devido a permissões insuficientes ou outro problema no sistema de arquivos.

- Quando ocorre uma falha desse tipo, o `printStackTrace()` exibe uma mensagem detalhada, como **"Acesso negado"**, ajudando o desenvolvedor a entender o motivo do erro.
- Testar esses cenários antecipadamente permite que o código lide com falhas de forma mais elegante, evitando travamentos inesperados.

###### Importância de ler o Stack Trace

Desenvolvedores devem aprender a **interpretar o Stack Trace** para diagnosticar problemas de forma eficiente.

- A maioria dos erros já foram relatados anteriormente, e pesquisar a mensagem do Stack Trace em fóruns como Stack Overflow pode levar a soluções rápidas.
- Compreender como o Stack Trace funciona permite identificar a origem do problema rapidamente, reduzindo o tempo necessário para corrigir falhas no código.

O tratamento adequado de exceções e a análise correta do Stack Trace são fundamentais para o desenvolvimento de aplicações robustas e seguras.

###### O problema de deixar blocos catch vazios

Deixar blocos `catch` vazios pode esconder falhas críticas e dificultar a manutenção do código. Quando uma exceção é capturada sem nenhum tratamento, o erro simplesmente desaparece, o que pode:

- **Esconder falhas**: O programa pode continuar funcionando de forma errada sem que o problema seja identificado.
- **Dificultar a depuração**: Sem logs ou mensagens de erro, encontrar a origem da falha se torna mais trabalhoso.
- **Gerar comportamentos inesperados**: Um erro ignorado pode afetar outras partes do sistema de maneira imprevisível.

O ideal é sempre registrar a exceção, exibindo uma mensagem, gerando logs ou relançando uma nova exceção apropriada.

###### Lançando exceções

O uso da palavra-chave `throw` permite lançar exceções manualmente para sinalizar condições de erro específicas. Isso é útil, por exemplo, para validar argumentos de métodos e evitar que operações sejam realizadas com valores incorretos.

Esse mecanismo melhora a previsibilidade do código e garante que falhas sejam detectadas antes que causem problemas maiores.

###### Exceções específicas

Utilizar exceções específicas torna o código mais informativo e facilita a depuração. Exceções como `IllegalArgumentException` devem ser usadas para indicar erros claros, como:

- **Entradas inválidas**: Quando um argumento não atende aos requisitos esperados, como números negativos em operações que exigem valores positivos.
- **Estados inválidos**: Quando uma ação não pode ser realizada devido à condição do sistema.

Dessa forma, os desenvolvedores conseguem identificar a causa do problema com mais rapidez.

###### Anotando métodos com throws

A cláusula `throws` na assinatura de um método indica que ele pode lançar determinadas exceções. Isso ajuda a documentar o comportamento do método e a alertar outros desenvolvedores sobre possíveis erros que precisam ser tratados.

Por exemplo, se um método trabalha com manipulação de arquivos e pode falhar por falta de permissões, ele deve declarar `throws IOException`. Isso permite que quem usa o método se prepare para lidar com essa situação.

###### Exceções Unchecked

As exceções do tipo **unchecked** são aquelas que não precisam ser declaradas na assinatura do método com `throws`. Elas são subclasses de `RuntimeException` e indicam erros de programação que devem ser evitados com boas práticas de desenvolvimento.

Diferente das exceções verificadas, que precisam ser tratadas para o código compilar, exceções unchecked como `NullPointerException`, `IndexOutOfBoundsException` e `ClassCastException` geralmente ocorrem por falhas na lógica do código e devem ser prevenidas antes de acontecerem.

###### Documentando parâmetros

Documentar os parâmetros dos métodos é essencial para evitar erros e melhorar a legibilidade do código. Isso inclui:

- **Definir restrições**: Especificar se um valor não pode ser `null`, não pode ser negativo ou deve estar dentro de um determinado intervalo.
- **Explicar o comportamento esperado**: Indicar como o parâmetro influencia a execução do método.
- **Descrever possíveis erros**: Informar quais exceções podem ser lançadas caso as restrições não sejam respeitadas.

Esse tipo de documentação pode ser feita com comentários no código ou utilizando JavaDoc, tornando o código mais claro e de fácil manutenção.

---
Compreender o uso adequado de exceções e boas práticas de documentação melhora a qualidade do código e previne falhas inesperadas no sistema.