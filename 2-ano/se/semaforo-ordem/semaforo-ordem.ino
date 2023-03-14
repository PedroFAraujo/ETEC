// C++ code
//
void setup()
{
  /*Indica o estado em que o dispositivo se encontra e vai ser
    iniciado ao menos uma vez
  */
  pinMode(13, OUTPUT); //output = saida
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
}

int a = 0;
int b = 0;
int  c = 0;

void loop()
{
  for (a; a<=2; a++){
    //Acende LED vermelho (porta 13)
    digitalWrite(13, HIGH); //ligar
    delay(25); // Wait for 1000 millisecond(s)
    digitalWrite(13, LOW); //desligar
    delay(500); // Wait for 1000 millisecond(s)
    
    //Acende LED amarelo (porta 12)
    digitalWrite(12, HIGH); //ligar
    delay(25); // Wait for 1000 millisecond(s)
    digitalWrite(12, LOW); //desligar
    delay(500); // Wait for 1000 millisecond(s)

    //Acende LED verde (porta 11)
    digitalWrite(11, HIGH); //ligar
    delay(25); // Wait for 1000 millisecond(s)
    digitalWrite(11, LOW); //desligar
    delay(500); // Wait for 1000 millisecond(s)
  }
  
  for (b; b<=2; b++){
    //Acende LED verde (porta 11)
    digitalWrite(11, HIGH); //ligar
    delay(25); // Wait for 1000 millisecond(s)
    digitalWrite(11, LOW); //desligar
    delay(500); // Wait for 1000 millisecond(s)
    
    //Acende LED amarelo (porta 12)
    digitalWrite(12, HIGH); //ligar
    delay(25); // Wait for 1000 millisecond(s)
    digitalWrite(12, LOW); //desligar
    delay(500); // Wait for 1000 millisecond(s)
    
    //Acende LED vermelho (porta 13)
    digitalWrite(13, HIGH); //ligar
    delay(25); // Wait for 1000 millisecond(s)
    digitalWrite(13, LOW); //desligar
    delay(500); // Wait for 1000 millisecond(s)
  }
  
  for (c; c<=2; c++){
    digitalWrite(13, HIGH); //ligar
    digitalWrite(12, HIGH); //ligar
    digitalWrite(11, HIGH); //ligar
    delay(250);
    digitalWrite(13, LOW); //desligar
    digitalWrite(11, LOW); //desligar
    digitalWrite(12, LOW); //desligar
  delay(250);
  }
  
}
