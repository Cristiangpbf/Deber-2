#include "iostream"
#include "string"
using namespace std;

int main(){	

	float t, p;
	string d,tu;
	
	cout<<"Ingrese los minutos completos al telefono: \n"<<endl;
	cin>>t;
	cout<<"Ingrese el dia de la llameda(LUN,MAR,MIER,JUE,VIE,SAB,DOM)\n"<<endl;
	cin>>d;
	cout<<"Ingrese el turno correspondiente: (matutino = M ; vespertino = v)\n"<<endl;
	cin>>tu;
	
	if(t<=5){        
        p=1;
    }else if(t<8){
        p=(t-5)*0.8+5;
    }else if(t<10){
        p=(t-8)*0.7 + 7.4;
    }else{
        p=(t-10)*0.5;
    }

    if(d=="DOM"){
        p=p+p*0.05;
    }else if(tu=="M"){
        p=p+p*0.15;
    }else{
        p=p+p*0.10;
    }
    
    cout<<"\nEl valor de la llamda es: "<<p<<endl;
    
}
