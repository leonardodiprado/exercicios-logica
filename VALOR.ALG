Algoritmo "valor"
Var
  valor : real
  forma : inteiro

Inicio
 escreva ("qual o valor normal? ")
 leia (valor)
 escreva ("qual a forma de pagamento? ")
 leia (forma)

  se forma = 1 entao
   escreva (valor*0.9)
  fimse
  se forma = 2 entao
   escreva (valor*0.85)
  fimse
  se forma = 3 entao
   escreva (valor)
  fimse
  se forma = 4 entao
   escreva (valor*1.1)
  fimse


Fimalgoritmo