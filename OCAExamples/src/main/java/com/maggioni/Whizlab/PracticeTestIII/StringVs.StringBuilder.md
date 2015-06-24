Vergleich String vs. StringBuilder
==================================
        
                     String      StringBuilder
s.length()           Ja          Ja
s.concat()           Ja          Nein
s.replace("A","B")   Ja          Nein
s.replace(a,2,"C")   Nein        Ja
s.substring(1)       Ja          Ja
s.indexOf("A")       Ja          Ja
s.append("A")        Nein        Ja
s.delete("A")        Nein        Ja
s.insert("A")        Nein        Ja
s.reverse()          Nein        Ja
s.setCharAt()        Nein        Ja
s.toLowerCase()      Ja          Nein
s.charAt()           Ja          Ja