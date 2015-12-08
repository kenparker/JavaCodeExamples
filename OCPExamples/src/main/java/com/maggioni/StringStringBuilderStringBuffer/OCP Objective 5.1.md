Chapter 8 und Chapter 5
Class Type      Regex pattern       Description
Simple          [agfd]              Match exactly one from a,g,f,d
Range           [a-f0-7]            Match exactly one from the range a to f or 0 to 7
Negation        [^123k-m]           Match exactly one character that is not . . 

Character class         Description
.                       Any character
\d                      A digit [0-9]
\D                      A nondigit [^0-9]
\s                      A whitespace character [space, \t (tab), \n (new line), . . ]
\S                      A nonwhitespace character [^\s]
\w                      A word character [a-zA-Z_0-9]
\W                      A nonword character [^\w]