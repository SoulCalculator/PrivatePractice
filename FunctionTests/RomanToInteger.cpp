#include <string>
#include <iostream>

using namespace std;

int RomanToInt( string );

int main (int argc, char* argv[])
{
	string str_input;
	cout << "Please enter a Roman Number: ";
	cin >> str_input;
	int result = RomanToInt(str_input);
	cout << "The Result is " << result << endl;
	return 0;
}

int RomanToInt( string str )
{
	int result = 0;
	int value = 0;
	int pre_value = 0;
	for ( int i = 0; i < str.length(); i++ )
	{
		switch(str[i])
		{
			case 'I':
			value = 1;
			break;
			case 'V':
			value = 5;
			break;
			case 'X':
			value = 10;
			break;
			case 'L':
			value = 50;
			break;
			case 'C':
			value = 100;
			break;
			case 'D':
			value = 500;
			break;
			case 'M':
			value = 1000;
			break;
			default:
			value = 0;
			break;
		}
		if (value > pre_value)
		{
			result += (value - 2 * pre_value);
		}
		else
		{
			result += value;
		}
		pre_value = value;
	}
	return result;
}
