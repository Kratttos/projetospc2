# Relatório Prático 1 PC2-2021-1
Nome: Everton Ferreira Carvalho

## Questionário

### Você fez uso do conceito de sobrecarga de funções? Onde?
Não.

### Você fez uso do conceito de Herança de funções? Onde? Você vê que houve benefícios?
Sim, em todas as classes que herdam de BasicIO e em todas as classes que herdam de FiguraGeoemetrica. Sim, ajudou a diminuir a quantidade de codigo.

### Você fez uso da função super() em construtores mesmo que indiretamente? Onde?
Sim, no construtor das classes BasicView, CirculoView, RetanguloView, QuadradoView, PainelDesenho, MainView, Retangulo, Quadrado, Quadrilateros é Circulo.

### Você fez uso da função this() em construtores mesmo que indiretamente? Onde?
Não.

### Você fez uso de sobreescrita de funções? onde? só de Object ou de alguma função sua mesmo?
Sim, Nas classes Circulo, FiguraGsGeometricas é Quaddrilateros. Eu sobrescrevi tanto funções de Object quanto funções criadas por mim mesmo.

### Qual o benefício do uso de classes ENUM?
Faz com que o codigo se torne um pouco mais facil de ler.

### Cole a imagem do diagrama de classe do seu sistema e faça um paragrafo se você entende este diagrama e ele representa realmente objetos do mundo real, com nomes de Metodos coerentes.
![Alt Diagrama](resources/img/FigurasUML.png)

O diagrama mostram 3 Figuras Geoemetricas(Circulo, Quadrado e Retangulo) que são filhas da classe FiguraGeoemetrica e no caso do Retangulo e do Quadrado são filhas de Quadrilateros que herdam de FigurasGeoemetricas. Todos tem os metodos calcularArea é calcularPerimetro que permite calcular a area e o perimetro respectivamente.

### Você fez uso da palavra Protected? Ela foi relevante onde?
Não