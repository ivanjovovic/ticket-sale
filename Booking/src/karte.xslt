<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
<xsl:template match="/">

<h1>Prodate karte domaćih utakmica F.K. Sutjeska Nikšić </h1>

  <table cellpading="2" cellspacing="2" border="1" >
   <tr bgcolor="blue">
    <th>ID</th>
    <th>Ime</th>
    <th>Prezime</th>
    <th>Kontakt</th>
    <th>Utakmica</th>
    <th>Tribina</th>
    <th>Sektor</th>
    <th>Sjediste</th>
   </tr>
   <xsl:apply-templates select="Karte" />
  </table>
</xsl:template> 
<xsl:template match="Karte">  
    <xsl:apply-templates select="Karta"></xsl:apply-templates>
</xsl:template>      
<xsl:template match="Karta">
    <tr>
        <td>
        <xsl:value-of select="Id"></xsl:value-of>
        </td>
        <td>
        <xsl:value-of select="Ime"></xsl:value-of>
        </td>
        <td>
        <xsl:value-of select="Prezime"></xsl:value-of>
        </td>
        <td>
        <xsl:value-of select="Kontakt"></xsl:value-of>
        </td>
        <td>
        <xsl:value-of select="Utakmica"></xsl:value-of>
        </td>
        <td>
        <xsl:value-of select="Tribina"></xsl:value-of>
        </td>
        <td>
        <xsl:value-of select="Sektor"></xsl:value-of>
        </td>
        <td>
        <xsl:value-of select="Sjediste"></xsl:value-of>
        </td>
    </tr>
 </xsl:template> 
    
 </xsl:stylesheet>   
    
    
   