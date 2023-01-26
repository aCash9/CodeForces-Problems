#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        string s;
        cin >> s;
        int n = s.length();
        int flag = 1;
        if (s[0] == 'Y' || s[0] == 's' || s[0] == 'e')
        {
            flag = 1;
        }
        else
        {
            flag = 0;
        }

        if (s == "YES" || s == "Yess" || s == "se")
        {
            flag = 0;
        }
        else
        {
            for (int i = 1; i < n - 1; i++)
            {
                if (s[i] == 'Y')
                {
                    if (!(s[i - 1] == 's' && s[i + 1] == 'e'))
                    {
                        flag = 0;
                        // System.out.println("y");
                    }
                }
                else if (s[i] == 'e')
                {
                    if (!(s[i - 1] == 'Y' && s[i + 1] == 's'))
                    {
                        flag = 0;
                        // System.out.println("e");
                    }
                }
                else if (s[i] == 's')
                {
                    if (!(s[i - 1] == 'e' && s[i + 1] == 'Y'))
                    {
                        flag = 0;
                        // System.out.println("e");
                    }
                }
                else
                {
                    flag = 0;
                }
            }
        }

        if (flag == 0)
        {
            cout << "NO" << endl;
        }
        else
        {
            cout << "YES" << endl;
        }
    }
}