#include <iostream>
#include <string>
using namespace std;

class Entity{
    string name;
    int health;
    int level;
    string type;

    public:
        //setter

        Entity& setName(const string& name){
            if(name !="" && name != " "){
                this->name = name;
                return *this;
            }
            cout<<"Invlid Name!!"<<endl;
            return *this;
        }

        Entity& setHealth(int health){
            if(health>=0){
                this->health = health;
                return *this;
            }
            return *this;

        }

        Entity& setLevel(int level){
            if(level>0){
                this->level = level;
                return *this;
            }
            return * this;
        }

        Entity& setType(const string& type){
            if(type !="" && type != " "){
                this->type = type;
                return *this;
            }
            cout<<"Invlid Name!!"<<endl;
            return *this;
        }

        //getter

        string getName() const{
            return name;
        }
        int getHealth() const{
            return health;
        }

        int getLevel() const{
            return level;
        }

        string getType() const{
            return type;
        }

        void displayInfo() const{
            cout<<"Player Info:"<<endl;
            cout<<" Name         :"<<getName()<<endl;
            cout<<" health       :"<<getHealth()<<endl;
            cout<<" Level        :"<<getLevel()<<endl;
            cout<<" type         :"<<getType()<<endl;
            cout<<endl;
        }
};

int main(){
    Entity player, enemy, item;
    player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");
    enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");
    item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

    player.displayInfo();
    cout<<"---------------------------------------------"<<endl;
    enemy.displayInfo();
    cout<<"---------------------------------------------"<<endl;
    item.displayInfo();
    return 0;
}


