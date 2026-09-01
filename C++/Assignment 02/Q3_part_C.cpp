#include <iostream>
using namespace std;

int main(){
    //storing row and columns number
    int row,col;

    //for conuting tile type
    int grassCount(0),waterCount(0),MountainCount(0),forestCount(0),dungeonCount(0);

    //getting rows and col number from user
    cout<<"Enter Row number: ";
    cin>>row;
    cout<<"Enter Colmun number: ";
    cin>>col;

    //creating array
    int **arrPtr = new int*[row];

    for(int i =0;i<row;i++){
        arrPtr[i] = new int[col];
    }

    //taking value from user

    cout<<"Enter value: "<<endl;

    for(int i =0;i<row;i++){
            for(int j= 0;j<col;j++){
                cin>>arrPtr[i][j];
            }
        }
    
    //printing in grid
    cout<<"===== GAME MAP ("<<row<<" x "<<col<<") ======"<<endl;
    for(int i =0;i<row;i++){
            for(int j= 0;j<col;j++){

                if(arrPtr[i][j]==0)
                    grassCount++;
                if(arrPtr[i][j]==1)
                    waterCount++;
                if(arrPtr[i][j]==2)
                    MountainCount++;
                if(arrPtr[i][j]==3)
                    forestCount++;
                if(arrPtr[i][j]==4)
                    dungeonCount++;
                cout<<" "<<arrPtr[i][j] <<" ";
            }
            cout<<endl;
        }

        //printing tiles count
        cout<<endl;
        cout<<"Legend: 0=Grass 1=Water 2=Mountain 3=Forest 4=Dungeon"<<endl;
        cout<<endl;
        cout<<"Tiles Count:"<<endl;
        cout<<"Grass    :"<<grassCount<<endl;
        cout<<"water    :"<<waterCount<<endl; 
        cout<<"Mountain :"<<MountainCount<<endl;
        cout<<"Forest   :"<<forestCount<<endl; 
        cout<<"Dungeon  :"<<dungeonCount<<endl;
        
        
    //deleting inner arrays

    for(int i =0;i<row;i++){
            delete[] arrPtr[i]; 
        }    

    delete[] arrPtr;
}