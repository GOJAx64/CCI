#include <iostream>

using namespace std;

bool isUnique(string s) {
    if (s.length() > 128)  return false;

    bool characters[128] = {false};
    
    for(int i = 0; i < s.length(); i++) {
        if(characters[s[i]] == true) {
            return false;
        }
        else characters[(int)s[i]] = true;
    }
    return true;
}

int main() {
    cout << isUnique("Helo abc?") << endl;
    return 0;
}