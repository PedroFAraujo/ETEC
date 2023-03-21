// C++ code
//

const int ledG1 = 13;
const int ledY1 = 12;
const int ledR1 = 11;
const int ledG2 = 7;
const int ledG3 = 6;
const int ledB1 = 5;
const int ledY2 = 4;
const int ledB2 = 3;
const int ledR2 = 2;
const int ledR3 = 1;
int ledPisca [] = {ledG2, ledG3, ledB1, ledY2, ledB2, ledR2, ledR3};

void setup()
{
  for(int i = 0; i < 5; i++){
  	pinMode(ledPisca[i], OUTPUT);
  }
}

void blink(int led, int msec){
	digitalWrite(led, HIGH);
  	delay(msec);
  	digitalWrite(led, LOW);
}

void loop()
{	
	digitalWrite(ledG1, HIGH);  
 	blink(ledPisca[random(7)], random(100,200));
    
}