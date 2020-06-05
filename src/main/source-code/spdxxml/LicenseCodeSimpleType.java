
package spdxxml;

/** 
 * A data type for a software license
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LicenseCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="3DFX"/>
 *     &lt;xs:enumeration value="3DFX-PL"/>
 *     &lt;xs:enumeration value="AAL"/>
 *     &lt;xs:enumeration value="ACAA"/>
 *     &lt;xs:enumeration value="ACDL"/>
 *     &lt;xs:enumeration value="ACE"/>
 *     &lt;xs:enumeration value="Adaptec-GPL"/>
 *     &lt;xs:enumeration value="Adaptec(RESTRICTED)"/>
 *     &lt;xs:enumeration value="Adobe-AFM"/>
 *     &lt;xs:enumeration value="Adobe-EULA"/>
 *     &lt;xs:enumeration value="AFL"/>
 *     &lt;xs:enumeration value="AFL-1.0"/>
 *     &lt;xs:enumeration value="AFL-1.1"/>
 *     &lt;xs:enumeration value="AFL-1.2"/>
 *     &lt;xs:enumeration value="AFL-2.0"/>
 *     &lt;xs:enumeration value="AFL-2.1"/>
 *     &lt;xs:enumeration value="AFL-3.0"/>
 *     &lt;xs:enumeration value="AFPL-Ghostscript"/>
 *     &lt;xs:enumeration value="AgainstDRM"/>
 *     &lt;xs:enumeration value="AGE-Logic"/>
 *     &lt;xs:enumeration value="Agere-EULA"/>
 *     &lt;xs:enumeration value="AGFA-EULA"/>
 *     &lt;xs:enumeration value="AGFA(RESTRICTED)"/>
 *     &lt;xs:enumeration value="AGPL"/>
 *     &lt;xs:enumeration value="AGPL-1.0"/>
 *     &lt;xs:enumeration value="AGPL-1.0+"/>
 *     &lt;xs:enumeration value="AGPL-3.0"/>
 *     &lt;xs:enumeration value="AGPL-3.0+"/>
 *     &lt;xs:enumeration value="Aladdin"/>
 *     &lt;xs:enumeration value="Alfresco"/>
 *     &lt;xs:enumeration value="Alfresco/FLOSS"/>
 *     &lt;xs:enumeration value="Algorithmics"/>
 *     &lt;xs:enumeration value="AMD"/>
 *     &lt;xs:enumeration value="AMD-EULA"/>
 *     &lt;xs:enumeration value="ANTLR-PD"/>
 *     &lt;xs:enumeration value="AOL-EULA"/>
 *     &lt;xs:enumeration value="Apache"/>
 *     &lt;xs:enumeration value="Apache-1.0"/>
 *     &lt;xs:enumeration value="Apache-1.1"/>
 *     &lt;xs:enumeration value="Apache-2.0"/>
 *     &lt;xs:enumeration value="Apache-style"/>
 *     &lt;xs:enumeration value="Apache-v1.0"/>
 *     &lt;xs:enumeration value="APL"/>
 *     &lt;xs:enumeration value="APL-1.0"/>
 *     &lt;xs:enumeration value="Apple(FontForge)"/>
 *     &lt;xs:enumeration value="Apple(Sample)"/>
 *     &lt;xs:enumeration value="APSL"/>
 *     &lt;xs:enumeration value="APSL-1.0"/>
 *     &lt;xs:enumeration value="APSL-1.1"/>
 *     &lt;xs:enumeration value="APSL-1.2"/>
 *     &lt;xs:enumeration value="APSL-2.0"/>
 *     &lt;xs:enumeration value="APSL-style"/>
 *     &lt;xs:enumeration value="Aptana"/>
 *     &lt;xs:enumeration value="Aptana-1.0"/>
 *     &lt;xs:enumeration value="ARJ"/>
 *     &lt;xs:enumeration value="Arphic-Font-PL"/>
 *     &lt;xs:enumeration value="Arphic-style"/>
 *     &lt;xs:enumeration value="Artifex"/>
 *     &lt;xs:enumeration value="Artistic-1.0-cl8"/>
 *     &lt;xs:enumeration value="Artistic-1.0-Perl"/>
 *     &lt;xs:enumeration value="Ascender-EULA"/>
 *     &lt;xs:enumeration value="ATI-EULA"/>
 *     &lt;xs:enumeration value="ATMEL-FW"/>
 *     &lt;xs:enumeration value="ATT(Non-commercial)"/>
 *     &lt;xs:enumeration value="ATT-Source"/>
 *     &lt;xs:enumeration value="ATT-Source-1.0"/>
 *     &lt;xs:enumeration value="ATT-Source-1.2d"/>
 *     &lt;xs:enumeration value="Baekmuk-Font"/>
 *     &lt;xs:enumeration value="Baekmuk(Hwan)"/>
 *     &lt;xs:enumeration value="BancTec"/>
 *     &lt;xs:enumeration value="Beerware"/>
 *     &lt;xs:enumeration value="Bellcore"/>
 *     &lt;xs:enumeration value="Bellcore-style"/>
 *     &lt;xs:enumeration value="BH-Font"/>
 *     &lt;xs:enumeration value="BH-Font-style"/>
 *     &lt;xs:enumeration value="BISON"/>
 *     &lt;xs:enumeration value="BitTorrent"/>
 *     &lt;xs:enumeration value="BitTorrent-1.0"/>
 *     &lt;xs:enumeration value="BitTorrent-1.1"/>
 *     &lt;xs:enumeration value="BIZNET"/>
 *     &lt;xs:enumeration value="BIZNET-style"/>
 *     &lt;xs:enumeration value="BrainStorm-EULA"/>
 *     &lt;xs:enumeration value="Broadcom-EULA"/>
 *     &lt;xs:enumeration value="BSD-2-Clause"/>
 *     &lt;xs:enumeration value="BSD-2-Clause-FreeBSD"/>
 *     &lt;xs:enumeration value="BSD-2-Clause-NetBSD"/>
 *     &lt;xs:enumeration value="BSD-3-Clause"/>
 *     &lt;xs:enumeration value="BSD-3-Clause-Clear"/>
 *     &lt;xs:enumeration value="BSD-3-Clause-Severability"/>
 *     &lt;xs:enumeration value="BSD-4-Clause"/>
 *     &lt;xs:enumeration value="BSD-4-Clause-UC"/>
 *     &lt;xs:enumeration value="BSL-1.0"/>
 *     &lt;xs:enumeration value="BSL-style"/>
 *     &lt;xs:enumeration value="CA"/>
 *     &lt;xs:enumeration value="Cadence"/>
 *     &lt;xs:enumeration value="CATOSL"/>
 *     &lt;xs:enumeration value="CATOSL-1.1"/>
 *     &lt;xs:enumeration value="CC0-1.0"/>
 *     &lt;xs:enumeration value="CC-BY"/>
 *     &lt;xs:enumeration value="CC-BY-1.0"/>
 *     &lt;xs:enumeration value="CC-BY-2.0"/>
 *     &lt;xs:enumeration value="CC-BY-2.5"/>
 *     &lt;xs:enumeration value="CC-BY-3.0"/>
 *     &lt;xs:enumeration value="CC-BY-4.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-1.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-2.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-2.5"/>
 *     &lt;xs:enumeration value="CC-BY-NC-3.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-4.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-ND-1.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-ND-2.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-ND-2.5"/>
 *     &lt;xs:enumeration value="CC-BY-NC-ND-3.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-ND-4.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-SA-1.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-SA-2.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-SA-2.5"/>
 *     &lt;xs:enumeration value="CC-BY-NC-SA-3.0"/>
 *     &lt;xs:enumeration value="CC-BY-NC-SA-4.0"/>
 *     &lt;xs:enumeration value="CC-BY-ND-1.0"/>
 *     &lt;xs:enumeration value="CC-BY-ND-2.0"/>
 *     &lt;xs:enumeration value="CC-BY-ND-2.5"/>
 *     &lt;xs:enumeration value="CC-BY-ND-3.0"/>
 *     &lt;xs:enumeration value="CC-BY-ND-4.0"/>
 *     &lt;xs:enumeration value="CC-BY-SA"/>
 *     &lt;xs:enumeration value="CC-BY-SA-1.0"/>
 *     &lt;xs:enumeration value="CC-BY-SA-2.0"/>
 *     &lt;xs:enumeration value="CC-BY-SA-2.5"/>
 *     &lt;xs:enumeration value="CC-BY-SA-3.0"/>
 *     &lt;xs:enumeration value="CC-BY-SA-4.0"/>
 *     &lt;xs:enumeration value="CC-LGPL"/>
 *     &lt;xs:enumeration value="CC-LGPL-2.1"/>
 *     &lt;xs:enumeration value="CCLRC"/>
 *     &lt;xs:enumeration value="CCPL"/>
 *     &lt;xs:enumeration value="CDDL"/>
 *     &lt;xs:enumeration value="CDDL-1.0"/>
 *     &lt;xs:enumeration value="CDDL-1.1"/>
 *     &lt;xs:enumeration value="CECILL"/>
 *     &lt;xs:enumeration value="CECILL-2.0"/>
 *     &lt;xs:enumeration value="CECILL-B"/>
 *     &lt;xs:enumeration value="CECILL-C"/>
 *     &lt;xs:enumeration value="CECILL(dual)"/>
 *     &lt;xs:enumeration value="Cisco"/>
 *     &lt;xs:enumeration value="Cisco-style"/>
 *     &lt;xs:enumeration value="Citrix"/>
 *     &lt;xs:enumeration value="ClArtistic"/>
 *     &lt;xs:enumeration value="ClearSilver"/>
 *     &lt;xs:enumeration value="CMake"/>
 *     &lt;xs:enumeration value="CMU-style"/>
 *     &lt;xs:enumeration value="CNRI-Python"/>
 *     &lt;xs:enumeration value="CNRI-Python-GPL-Compatible"/>
 *     &lt;xs:enumeration value="Combined_OpenSSL+SSLeay"/>
 *     &lt;xs:enumeration value="CompuServe"/>
 *     &lt;xs:enumeration value="Comtrol"/>
 *     &lt;xs:enumeration value="Condor-1.0"/>
 *     &lt;xs:enumeration value="Condor-1.1"/>
 *     &lt;xs:enumeration value="CopyLeft[1]"/>
 *     &lt;xs:enumeration value="CopyLeft[2]"/>
 *     &lt;xs:enumeration value="CPL"/>
 *     &lt;xs:enumeration value="CPL-0.5"/>
 *     &lt;xs:enumeration value="CPL-1.0"/>
 *     &lt;xs:enumeration value="CPOL"/>
 *     &lt;xs:enumeration value="CPOL-1.02"/>
 *     &lt;xs:enumeration value="Cryptogams"/>
 *     &lt;xs:enumeration value="CUA-OPL-1.0"/>
 *     &lt;xs:enumeration value="CUPS"/>
 *     &lt;xs:enumeration value="CUPS-EULA"/>
 *     &lt;xs:enumeration value="Cylink-ISC"/>
 *     &lt;xs:enumeration value="Cypress-FW"/>
 *     &lt;xs:enumeration value="DARPA"/>
 *     &lt;xs:enumeration value="DARPA-Cougaar"/>
 *     &lt;xs:enumeration value="Debian-social-DFSG"/>
 *     &lt;xs:enumeration value="Debian-SPI"/>
 *     &lt;xs:enumeration value="Debian-SPI-style"/>
 *     &lt;xs:enumeration value="D-FSL-1.0"/>
 *     &lt;xs:enumeration value="DMTF"/>
 *     &lt;xs:enumeration value="DOCBOOK"/>
 *     &lt;xs:enumeration value="DOCBOOK-style"/>
 *     &lt;xs:enumeration value="DPTC"/>
 *     &lt;xs:enumeration value="DSCT"/>
 *     &lt;xs:enumeration value="DSL"/>
 *     &lt;xs:enumeration value="Dyade"/>
 *     &lt;xs:enumeration value="EBT-style"/>
 *     &lt;xs:enumeration value="ECL-1.0"/>
 *     &lt;xs:enumeration value="ECL-2.0"/>
 *     &lt;xs:enumeration value="eCos-2.0"/>
 *     &lt;xs:enumeration value="EFL"/>
 *     &lt;xs:enumeration value="EFL-1.0"/>
 *     &lt;xs:enumeration value="EFL-2.0"/>
 *     &lt;xs:enumeration value="eGenix"/>
 *     &lt;xs:enumeration value="Empty-file-no-data!"/>
 *     &lt;xs:enumeration value="Entessa"/>
 *     &lt;xs:enumeration value="Epinions"/>
 *     &lt;xs:enumeration value="Epson-EULA"/>
 *     &lt;xs:enumeration value="Epson-PL"/>
 *     &lt;xs:enumeration value="ErlPL-1.1"/>
 *     &lt;xs:enumeration value="EUDatagrid"/>
 *     &lt;xs:enumeration value="EUPL-1.0"/>
 *     &lt;xs:enumeration value="EUPL-1.1"/>
 *     &lt;xs:enumeration value="FaCE"/>
 *     &lt;xs:enumeration value="Fair"/>
 *     &lt;xs:enumeration value="Fair-style"/>
 *     &lt;xs:enumeration value="FAL-1.0"/>
 *     &lt;xs:enumeration value="FAL-1.3"/>
 *     &lt;xs:enumeration value="FedoraCLA"/>
 *     &lt;xs:enumeration value="Flash2xml-1.0"/>
 *     &lt;xs:enumeration value="Flora"/>
 *     &lt;xs:enumeration value="Flora-1.0"/>
 *     &lt;xs:enumeration value="Flora-1.1"/>
 *     &lt;xs:enumeration value="Frameworx"/>
 *     &lt;xs:enumeration value="Frameworx-1.0"/>
 *     &lt;xs:enumeration value="FreeBSD-Doc"/>
 *     &lt;xs:enumeration value="Free-PL"/>
 *     &lt;xs:enumeration value="Free-SW"/>
 *     &lt;xs:enumeration value="FTL"/>
 *     &lt;xs:enumeration value="FTL-style"/>
 *     &lt;xs:enumeration value="Fujitsu"/>
 *     &lt;xs:enumeration value="Garmin-EULA"/>
 *     &lt;xs:enumeration value="Genivia(Commercial)"/>
 *     &lt;xs:enumeration value="GFDL"/>
 *     &lt;xs:enumeration value="GFDL-1.1"/>
 *     &lt;xs:enumeration value="GFDL-1.1+"/>
 *     &lt;xs:enumeration value="GFDL-1.2"/>
 *     &lt;xs:enumeration value="GFDL-1.2+"/>
 *     &lt;xs:enumeration value="GFDL-1.3"/>
 *     &lt;xs:enumeration value="GFDL-v1.2"/>
 *     &lt;xs:enumeration value="Ghostscript-GPL-1.1"/>
 *     &lt;xs:enumeration value="Giftware"/>
 *     &lt;xs:enumeration value="GNU-copyleft"/>
 *     &lt;xs:enumeration value="GNU-Ghostscript"/>
 *     &lt;xs:enumeration value="GNU-javamail-exception"/>
 *     &lt;xs:enumeration value="GNU-Manpages"/>
 *     &lt;xs:enumeration value="Google-BSD"/>
 *     &lt;xs:enumeration value="Govt-restrict"/>
 *     &lt;xs:enumeration value="GPL"/>
 *     &lt;xs:enumeration value="GPL-1.0"/>
 *     &lt;xs:enumeration value="GPL-1.0+"/>
 *     &lt;xs:enumeration value="GPL-2.0"/>
 *     &lt;xs:enumeration value="GPL-2.0+"/>
 *     &lt;xs:enumeration value="GPL-2.0:3.0"/>
 *     &lt;xs:enumeration value="GPL-2.0+:3.0"/>
 *     &lt;xs:enumeration value="GPL-2.0+KDEupgradeClause"/>
 *     &lt;xs:enumeration value="GPL-2.0-with-autoconf-exception"/>
 *     &lt;xs:enumeration value="GPL-2.0-with-bison-exception"/>
 *     &lt;xs:enumeration value="GPL-2.0+-with-bison-exception"/>
 *     &lt;xs:enumeration value="GPL-2.0-with-classpath-exception"/>
 *     &lt;xs:enumeration value="GPL-2.0+-with-classpath-exception"/>
 *     &lt;xs:enumeration value="GPL-2.0-with-font-exception"/>
 *     &lt;xs:enumeration value="GPL-2.0-with-GCC-exception"/>
 *     &lt;xs:enumeration value="GPL-2.1[sic]"/>
 *     &lt;xs:enumeration value="GPL-2.1+[sic]"/>
 *     &lt;xs:enumeration value="GPL-3?"/>
 *     &lt;xs:enumeration value="GPL-3.0"/>
 *     &lt;xs:enumeration value="GPL-3.0+"/>
 *     &lt;xs:enumeration value="GPL-3.0-with-autoconf-exception"/>
 *     &lt;xs:enumeration value="GPL-3.0-with-GCC-exception"/>
 *     &lt;xs:enumeration value="GPL-3.0+-with-GCC-exception"/>
 *     &lt;xs:enumeration value="GPL-Meta"/>
 *     &lt;xs:enumeration value="GPL-or-LGPL"/>
 *     &lt;xs:enumeration value="GPL(rms)"/>
 *     &lt;xs:enumeration value="GPL-with-autoconf-exception"/>
 *     &lt;xs:enumeration value="gSOAP"/>
 *     &lt;xs:enumeration value="gSOAP-1.3b"/>
 *     &lt;xs:enumeration value="H2"/>
 *     &lt;xs:enumeration value="H2-1.0"/>
 *     &lt;xs:enumeration value="Hacktivismo"/>
 *     &lt;xs:enumeration value="Hauppauge"/>
 *     &lt;xs:enumeration value="Helix/RealNetworks-EULA"/>
 *     &lt;xs:enumeration value="HPND"/>
 *     &lt;xs:enumeration value="IBM-Courier"/>
 *     &lt;xs:enumeration value="IBM-JCL"/>
 *     &lt;xs:enumeration value="IBM-pibs"/>
 *     &lt;xs:enumeration value="IBM-reciprocal"/>
 *     &lt;xs:enumeration value="ID-EULA"/>
 *     &lt;xs:enumeration value="IDPL"/>
 *     &lt;xs:enumeration value="IDPL-1.0"/>
 *     &lt;xs:enumeration value="IEEE-Doc"/>
 *     &lt;xs:enumeration value="IETF"/>
 *     &lt;xs:enumeration value="IETF-style"/>
 *     &lt;xs:enumeration value="IJG"/>
 *     &lt;xs:enumeration value="ImageMagick"/>
 *     &lt;xs:enumeration value="ImageMagick(Apache)"/>
 *     &lt;xs:enumeration value="ImageMagick-style"/>
 *     &lt;xs:enumeration value="Imlib2"/>
 *     &lt;xs:enumeration value="InfoSeek"/>
 *     &lt;xs:enumeration value="info-zip"/>
 *     &lt;xs:enumeration value="InnerNet"/>
 *     &lt;xs:enumeration value="InnerNet-2.00"/>
 *     &lt;xs:enumeration value="InnerNet-style"/>
 *     &lt;xs:enumeration value="Intel-EULA"/>
 *     &lt;xs:enumeration value="Intel(RESTRICTED)"/>
 *     &lt;xs:enumeration value="Intel-WLAN"/>
 *     &lt;xs:enumeration value="Interbase-1.0"/>
 *     &lt;xs:enumeration value="Interbase-PL"/>
 *     &lt;xs:enumeration value="Interlink-EULA"/>
 *     &lt;xs:enumeration value="Intranet-only"/>
 *     &lt;xs:enumeration value="IOS"/>
 *     &lt;xs:enumeration value="IoSoft(COMMERCIAL)"/>
 *     &lt;xs:enumeration value="IPA"/>
 *     &lt;xs:enumeration value="IPA-Font-EULA"/>
 *     &lt;xs:enumeration value="IPL"/>
 *     &lt;xs:enumeration value="IPL-1.0"/>
 *     &lt;xs:enumeration value="IPL-2.0"/>
 *     &lt;xs:enumeration value="IPTC"/>
 *     &lt;xs:enumeration value="IronDoc"/>
 *     &lt;xs:enumeration value="ISC"/>
 *     &lt;xs:enumeration value="Jabber"/>
 *     &lt;xs:enumeration value="Java-WSDL4J"/>
 *     &lt;xs:enumeration value="Java-WSDL-Policy"/>
 *     &lt;xs:enumeration value="Java-WSDL-Schema"/>
 *     &lt;xs:enumeration value="Java-WSDL-Spec"/>
 *     &lt;xs:enumeration value="JISP"/>
 *     &lt;xs:enumeration value="JPNIC"/>
 *     &lt;xs:enumeration value="JSON"/>
 *     &lt;xs:enumeration value="KDE"/>
 *     &lt;xs:enumeration value="Keyspan-FW"/>
 *     &lt;xs:enumeration value="KnowledgeTree-1.1"/>
 *     &lt;xs:enumeration value="Knuth-style"/>
 *     &lt;xs:enumeration value="Lachman-Proprietary"/>
 *     &lt;xs:enumeration value="Larabie-EULA"/>
 *     &lt;xs:enumeration value="LDP-1A"/>
 *     &lt;xs:enumeration value="LDP-2.0"/>
 *     &lt;xs:enumeration value="Legato"/>
 *     &lt;xs:enumeration value="Leptonica"/>
 *     &lt;xs:enumeration value="LGPL"/>
 *     &lt;xs:enumeration value="LGPL-1.0"/>
 *     &lt;xs:enumeration value="LGPL-1.0+"/>
 *     &lt;xs:enumeration value="LGPL-2.0"/>
 *     &lt;xs:enumeration value="LGPL-2.0+"/>
 *     &lt;xs:enumeration value="LGPL-2.1"/>
 *     &lt;xs:enumeration value="LGPL-2.1+"/>
 *     &lt;xs:enumeration value="LGPL-2.1+-KDE-exception"/>
 *     &lt;xs:enumeration value="LGPL-3?"/>
 *     &lt;xs:enumeration value="LGPL-3.0"/>
 *     &lt;xs:enumeration value="LGPL-3.0+"/>
 *     &lt;xs:enumeration value="LIBGCJ"/>
 *     &lt;xs:enumeration value="Libpng"/>
 *     &lt;xs:enumeration value="Link-exception"/>
 *     &lt;xs:enumeration value="LinuxDoc"/>
 *     &lt;xs:enumeration value="Linux-HOWTO"/>
 *     &lt;xs:enumeration value="Logica-OSL-1.0"/>
 *     &lt;xs:enumeration value="LPL-1.0"/>
 *     &lt;xs:enumeration value="LPL-1.02"/>
 *     &lt;xs:enumeration value="LPPL"/>
 *     &lt;xs:enumeration value="LPPL-1.0"/>
 *     &lt;xs:enumeration value="LPPL-1.0+"/>
 *     &lt;xs:enumeration value="LPPL-1.1"/>
 *     &lt;xs:enumeration value="LPPL-1.1+"/>
 *     &lt;xs:enumeration value="LPPL-1.2"/>
 *     &lt;xs:enumeration value="LPPL-1.2+"/>
 *     &lt;xs:enumeration value="LPPL-1.3"/>
 *     &lt;xs:enumeration value="LPPL-1.3+"/>
 *     &lt;xs:enumeration value="LPPL-1.3a"/>
 *     &lt;xs:enumeration value="LPPL-1.3a+"/>
 *     &lt;xs:enumeration value="LPPL-1.3b"/>
 *     &lt;xs:enumeration value="LPPL-1.3b+"/>
 *     &lt;xs:enumeration value="LPPL-1.3c"/>
 *     &lt;xs:enumeration value="LPPL-1.3c+"/>
 *     &lt;xs:enumeration value="MacroMedia-RPSL"/>
 *     &lt;xs:enumeration value="Macrovision"/>
 *     &lt;xs:enumeration value="Macrovision-EULA"/>
 *     &lt;xs:enumeration value="Majordomo"/>
 *     &lt;xs:enumeration value="Majordomo-1.1"/>
 *     &lt;xs:enumeration value="Mandriva"/>
 *     &lt;xs:enumeration value="Mellanox"/>
 *     &lt;xs:enumeration value="MetroLink"/>
 *     &lt;xs:enumeration value="MetroLink-nonfree"/>
 *     &lt;xs:enumeration value="Mibble"/>
 *     &lt;xs:enumeration value="Mibble-2.8"/>
 *     &lt;xs:enumeration value="Microsoft"/>
 *     &lt;xs:enumeration value="Migemo"/>
 *     &lt;xs:enumeration value="MindTerm"/>
 *     &lt;xs:enumeration value="MirOS"/>
 *     &lt;xs:enumeration value="MITEM"/>
 *     &lt;xs:enumeration value="MitreCVW-style"/>
 *     &lt;xs:enumeration value="Motosoto"/>
 *     &lt;xs:enumeration value="MPEG3-decoder"/>
 *     &lt;xs:enumeration value="MPL"/>
 *     &lt;xs:enumeration value="MPL-1.0"/>
 *     &lt;xs:enumeration value="MPL-1.1"/>
 *     &lt;xs:enumeration value="MPL-1.1+"/>
 *     &lt;xs:enumeration value="MPL-1.1-style"/>
 *     &lt;xs:enumeration value="MPL-2.0"/>
 *     &lt;xs:enumeration value="MPL-2.0-no-copyleft-exception"/>
 *     &lt;xs:enumeration value="MPL-EULA-1.1"/>
 *     &lt;xs:enumeration value="MPL-EULA-2.0"/>
 *     &lt;xs:enumeration value="MPL-EULA-3.0"/>
 *     &lt;xs:enumeration value="MPL-style"/>
 *     &lt;xs:enumeration value="M-Plus-Project"/>
 *     &lt;xs:enumeration value="MRL"/>
 *     &lt;xs:enumeration value="MS-indemnity"/>
 *     &lt;xs:enumeration value="MS-LPL"/>
 *     &lt;xs:enumeration value="MS-LRL"/>
 *     &lt;xs:enumeration value="Multics"/>
 *     &lt;xs:enumeration value="MX4J"/>
 *     &lt;xs:enumeration value="MX4J-1.0"/>
 *     &lt;xs:enumeration value="MySQL-0.3"/>
 *     &lt;xs:enumeration value="MySQL/FLOSS"/>
 *     &lt;xs:enumeration value="MySQL-style"/>
 *     &lt;xs:enumeration value="NASA"/>
 *     &lt;xs:enumeration value="NASA-1.3"/>
 *     &lt;xs:enumeration value="Naumen"/>
 *     &lt;xs:enumeration value="NBPL-1.0"/>
 *     &lt;xs:enumeration value="nCipher"/>
 *     &lt;xs:enumeration value="NCSA"/>
 *     &lt;xs:enumeration value="NESSUS-EULA"/>
 *     &lt;xs:enumeration value="NGPL"/>
 *     &lt;xs:enumeration value="Nokia"/>
 *     &lt;xs:enumeration value="No_license_found"/>
 *     &lt;xs:enumeration value="non-ATT-BSD"/>
 *     &lt;xs:enumeration value="None"/>
 *     &lt;xs:enumeration value="NOSL-1.0"/>
 *     &lt;xs:enumeration value="Not-for-sale!"/>
 *     &lt;xs:enumeration value="Not-Free!"/>
 *     &lt;xs:enumeration value="Not-Internet"/>
 *     &lt;xs:enumeration value="Not-OpenSource!"/>
 *     &lt;xs:enumeration value="NOT-Open-Source!"/>
 *     &lt;xs:enumeration value="NOT-public-domain"/>
 *     &lt;xs:enumeration value="Novell"/>
 *     &lt;xs:enumeration value="Novell-EULA"/>
 *     &lt;xs:enumeration value="NPL"/>
 *     &lt;xs:enumeration value="NPL-1.0"/>
 *     &lt;xs:enumeration value="NPL-1.1"/>
 *     &lt;xs:enumeration value="NPL-1.1+"/>
 *     &lt;xs:enumeration value="NPL-EULA"/>
 *     &lt;xs:enumeration value="NPOSL-3.0"/>
 *     &lt;xs:enumeration value="NRL"/>
 *     &lt;xs:enumeration value="NTP"/>
 *     &lt;xs:enumeration value="OASIS"/>
 *     &lt;xs:enumeration value="OCL"/>
 *     &lt;xs:enumeration value="OCL-1.0"/>
 *     &lt;xs:enumeration value="OCLC"/>
 *     &lt;xs:enumeration value="OCLC-1.0"/>
 *     &lt;xs:enumeration value="OCLC-2.0"/>
 *     &lt;xs:enumeration value="OCL-style"/>
 *     &lt;xs:enumeration value="ODbL-1.0"/>
 *     &lt;xs:enumeration value="ODL"/>
 *     &lt;xs:enumeration value="OFL-1.0"/>
 *     &lt;xs:enumeration value="OFL-1.1"/>
 *     &lt;xs:enumeration value="OGTSL"/>
 *     &lt;xs:enumeration value="OLDAP"/>
 *     &lt;xs:enumeration value="OLDAP-1.1"/>
 *     &lt;xs:enumeration value="OLDAP-1.2"/>
 *     &lt;xs:enumeration value="OLDAP-1.3"/>
 *     &lt;xs:enumeration value="OLDAP-1.4"/>
 *     &lt;xs:enumeration value="OLDAP-2.0"/>
 *     &lt;xs:enumeration value="OLDAP-2.0.1"/>
 *     &lt;xs:enumeration value="OLDAP-2.1"/>
 *     &lt;xs:enumeration value="OLDAP-2.2"/>
 *     &lt;xs:enumeration value="OLDAP-2.2.1"/>
 *     &lt;xs:enumeration value="OLDAP-2.2.2"/>
 *     &lt;xs:enumeration value="OLDAP-2.3"/>
 *     &lt;xs:enumeration value="OLDAP-2.4"/>
 *     &lt;xs:enumeration value="OLDAP-2.5"/>
 *     &lt;xs:enumeration value="OLDAP-2.6"/>
 *     &lt;xs:enumeration value="OLDAP-2.7"/>
 *     &lt;xs:enumeration value="OLDAP-2.8"/>
 *     &lt;xs:enumeration value="OLDAP-style"/>
 *     &lt;xs:enumeration value="OMF"/>
 *     &lt;xs:enumeration value="Ontopia"/>
 *     &lt;xs:enumeration value="OpenCASCADE-PL"/>
 *     &lt;xs:enumeration value="OpenGroup"/>
 *     &lt;xs:enumeration value="OpenGroup-Proprietary"/>
 *     &lt;xs:enumeration value="OpenMarket"/>
 *     &lt;xs:enumeration value="Open-PL"/>
 *     &lt;xs:enumeration value="Open-PL-0.4"/>
 *     &lt;xs:enumeration value="Open-PL-1.0"/>
 *     &lt;xs:enumeration value="Open-PL-style"/>
 *     &lt;xs:enumeration value="OPL-1.0"/>
 *     &lt;xs:enumeration value="Oracle-Berkeley-DB"/>
 *     &lt;xs:enumeration value="O'Reilly"/>
 *     &lt;xs:enumeration value="O'Reilly-style"/>
 *     &lt;xs:enumeration value="OSD"/>
 *     &lt;xs:enumeration value="OSL"/>
 *     &lt;xs:enumeration value="OSL-1.0"/>
 *     &lt;xs:enumeration value="OSL-1.1"/>
 *     &lt;xs:enumeration value="OSL-2.0"/>
 *     &lt;xs:enumeration value="OSL-2.1"/>
 *     &lt;xs:enumeration value="OSL-3.0"/>
 *     &lt;xs:enumeration value="Paradigm"/>
 *     &lt;xs:enumeration value="Patent-ref"/>
 *     &lt;xs:enumeration value="PDDL-1.0"/>
 *     &lt;xs:enumeration value="Phorum"/>
 *     &lt;xs:enumeration value="PHP-3.0"/>
 *     &lt;xs:enumeration value="PHP-style"/>
 *     &lt;xs:enumeration value="Piriform"/>
 *     &lt;xs:enumeration value="Pixware-EULA"/>
 *     &lt;xs:enumeration value="Polyserve-CONFIDENTIAL"/>
 *     &lt;xs:enumeration value="Postfix"/>
 *     &lt;xs:enumeration value="PostgreSQL"/>
 *     &lt;xs:enumeration value="Powder-Proprietary"/>
 *     &lt;xs:enumeration value="Princeton"/>
 *     &lt;xs:enumeration value="Princeton-style"/>
 *     &lt;xs:enumeration value="Proprietary!"/>
 *     &lt;xs:enumeration value="Public-domain"/>
 *     &lt;xs:enumeration value="Public-domain(C)"/>
 *     &lt;xs:enumeration value="Public-domain-ref"/>
 *     &lt;xs:enumeration value="Public-Use"/>
 *     &lt;xs:enumeration value="Public-Use-1.0"/>
 *     &lt;xs:enumeration value="Python"/>
 *     &lt;xs:enumeration value="Python-2.0"/>
 *     &lt;xs:enumeration value="Python-2.0.1"/>
 *     &lt;xs:enumeration value="Python-2.0.2"/>
 *     &lt;xs:enumeration value="Python-2.1.1"/>
 *     &lt;xs:enumeration value="Python-2.1.3"/>
 *     &lt;xs:enumeration value="Python-2.2"/>
 *     &lt;xs:enumeration value="Python-2.2.3"/>
 *     &lt;xs:enumeration value="Python-2.2.7"/>
 *     &lt;xs:enumeration value="Python-2.3"/>
 *     &lt;xs:enumeration value="Python-2.3.7"/>
 *     &lt;xs:enumeration value="Python-2.4.4"/>
 *     &lt;xs:enumeration value="Python-style"/>
 *     &lt;xs:enumeration value="Qmail"/>
 *     &lt;xs:enumeration value="QPL"/>
 *     &lt;xs:enumeration value="QPL-1.0"/>
 *     &lt;xs:enumeration value="QT(Commercial)"/>
 *     &lt;xs:enumeration value="QuarterDeck"/>
 *     &lt;xs:enumeration value="Quest-EULA"/>
 *     &lt;xs:enumeration value="RCSL"/>
 *     &lt;xs:enumeration value="RCSL-1.0"/>
 *     &lt;xs:enumeration value="RCSL-2.0"/>
 *     &lt;xs:enumeration value="RCSL-3.0"/>
 *     &lt;xs:enumeration value="RealNetworks-EULA"/>
 *     &lt;xs:enumeration value="RealNetworks-Unknown"/>
 *     &lt;xs:enumeration value="RedHat-EULA"/>
 *     &lt;xs:enumeration value="Redland"/>
 *     &lt;xs:enumeration value="Restricted-rights"/>
 *     &lt;xs:enumeration value="RHeCos-1.1"/>
 *     &lt;xs:enumeration value="Riverbank-EULA"/>
 *     &lt;xs:enumeration value="RPL-1.5"/>
 *     &lt;xs:enumeration value="RPSL"/>
 *     &lt;xs:enumeration value="RPSL-1.0"/>
 *     &lt;xs:enumeration value="RPSL-2.0"/>
 *     &lt;xs:enumeration value="RPSL-3.0"/>
 *     &lt;xs:enumeration value="RSCPL"/>
 *     &lt;xs:enumeration value="Ruby"/>
 *     &lt;xs:enumeration value="SAX-PD"/>
 *     &lt;xs:enumeration value="SciTech"/>
 *     &lt;xs:enumeration value="SCO(commercial)"/>
 *     &lt;xs:enumeration value="SCSL"/>
 *     &lt;xs:enumeration value="SCSL-2.3"/>
 *     &lt;xs:enumeration value="SCSL-3.0"/>
 *     &lt;xs:enumeration value="SCSL-TSA"/>
 *     &lt;xs:enumeration value="SCSL-TSA-1.0"/>
 *     &lt;xs:enumeration value="See-doc(OTHER)"/>
 *     &lt;xs:enumeration value="See-file"/>
 *     &lt;xs:enumeration value="See-file(COPYING)"/>
 *     &lt;xs:enumeration value="See-file(LICENSE)"/>
 *     &lt;xs:enumeration value="See-file(README)"/>
 *     &lt;xs:enumeration value="See-URL"/>
 *     &lt;xs:enumeration value="Sendmail"/>
 *     &lt;xs:enumeration value="SGI"/>
 *     &lt;xs:enumeration value="SGI-B-1.0"/>
 *     &lt;xs:enumeration value="SGI-B-1.1"/>
 *     &lt;xs:enumeration value="SGI-B-2.0"/>
 *     &lt;xs:enumeration value="SGI-Freeware"/>
 *     &lt;xs:enumeration value="SGI_GLX"/>
 *     &lt;xs:enumeration value="SGI-Proprietary"/>
 *     &lt;xs:enumeration value="SGI-style"/>
 *     &lt;xs:enumeration value="SGML"/>
 *     &lt;xs:enumeration value="SimPL-2.0"/>
 *     &lt;xs:enumeration value="SISSL"/>
 *     &lt;xs:enumeration value="SISSL-1.1"/>
 *     &lt;xs:enumeration value="SISSL-1.2"/>
 *     &lt;xs:enumeration value="Skype-EULA"/>
 *     &lt;xs:enumeration value="Sleepycat(Non-commercial)"/>
 *     &lt;xs:enumeration value="SMLNJ"/>
 *     &lt;xs:enumeration value="SNIA"/>
 *     &lt;xs:enumeration value="SNIA-1.0"/>
 *     &lt;xs:enumeration value="SNIA-1.1"/>
 *     &lt;xs:enumeration value="SpikeSource"/>
 *     &lt;xs:enumeration value="SPL"/>
 *     &lt;xs:enumeration value="SPL-1.0"/>
 *     &lt;xs:enumeration value="Stanford"/>
 *     &lt;xs:enumeration value="Stanford-style"/>
 *     &lt;xs:enumeration value="SugarCRM-1.1.3"/>
 *     &lt;xs:enumeration value="Sun-BCLA-1.5.0"/>
 *     &lt;xs:enumeration value="Sun-EULA"/>
 *     &lt;xs:enumeration value="Sun-IP"/>
 *     &lt;xs:enumeration value="Sun-Java"/>
 *     &lt;xs:enumeration value="Sun(Non-commercial)"/>
 *     &lt;xs:enumeration value="SunPro"/>
 *     &lt;xs:enumeration value="Sun(RESTRICTED)"/>
 *     &lt;xs:enumeration value="Sun-RPC"/>
 *     &lt;xs:enumeration value="Sun-SCA"/>
 *     &lt;xs:enumeration value="Sun(tm)"/>
 *     &lt;xs:enumeration value="SW-Research"/>
 *     &lt;xs:enumeration value="Tapjoy"/>
 *     &lt;xs:enumeration value="Tektronix"/>
 *     &lt;xs:enumeration value="Tektronix-style"/>
 *     &lt;xs:enumeration value="Trademark-ref"/>
 *     &lt;xs:enumeration value="Trident-EULA"/>
 *     &lt;xs:enumeration value="Trolltech"/>
 *     &lt;xs:enumeration value="U-BC"/>
 *     &lt;xs:enumeration value="U-Cambridge"/>
 *     &lt;xs:enumeration value="U-Cambridge-style"/>
 *     &lt;xs:enumeration value="UCAR"/>
 *     &lt;xs:enumeration value="UCAR-style"/>
 *     &lt;xs:enumeration value="U-Chicago"/>
 *     &lt;xs:enumeration value="U-Columbia"/>
 *     &lt;xs:enumeration value="UCWare-EULA"/>
 *     &lt;xs:enumeration value="U-Del"/>
 *     &lt;xs:enumeration value="U-Del-style"/>
 *     &lt;xs:enumeration value="U-Monash"/>
 *     &lt;xs:enumeration value="UnclassifiedLicense"/>
 *     &lt;xs:enumeration value="Unidex"/>
 *     &lt;xs:enumeration value="UnitedLinux-EULA"/>
 *     &lt;xs:enumeration value="Unlicense"/>
 *     &lt;xs:enumeration value="unRAR restriction"/>
 *     &lt;xs:enumeration value="URA(gov't)"/>
 *     &lt;xs:enumeration value="USC"/>
 *     &lt;xs:enumeration value="USC(Non-commercial)"/>
 *     &lt;xs:enumeration value="USC-style"/>
 *     &lt;xs:enumeration value="US-Export-restrict"/>
 *     &lt;xs:enumeration value="U-Utah"/>
 *     &lt;xs:enumeration value="U-Wash(Free-Fork)"/>
 *     &lt;xs:enumeration value="VIM"/>
 *     &lt;xs:enumeration value="Vixie"/>
 *     &lt;xs:enumeration value="Vixie-license"/>
 *     &lt;xs:enumeration value="VMware-EULA"/>
 *     &lt;xs:enumeration value="VSL-1.0"/>
 *     &lt;xs:enumeration value="Wash-U-style"/>
 *     &lt;xs:enumeration value="Watcom"/>
 *     &lt;xs:enumeration value="Watcom-1.0"/>
 *     &lt;xs:enumeration value="WebM"/>
 *     &lt;xs:enumeration value="Wintertree"/>
 *     &lt;xs:enumeration value="WordNet-3.0"/>
 *     &lt;xs:enumeration value="WTFPL"/>
 *     &lt;xs:enumeration value="WTI(Not-free)"/>
 *     &lt;xs:enumeration value="WXwindows"/>
 *     &lt;xs:enumeration value="X11"/>
 *     &lt;xs:enumeration value="Xerox"/>
 *     &lt;xs:enumeration value="Xerox-style"/>
 *     &lt;xs:enumeration value="XFree86"/>
 *     &lt;xs:enumeration value="XFree86-1.0"/>
 *     &lt;xs:enumeration value="XFree86-1.1"/>
 *     &lt;xs:enumeration value="Ximian"/>
 *     &lt;xs:enumeration value="Ximian-1.0"/>
 *     &lt;xs:enumeration value="XMLDB-1.0"/>
 *     &lt;xs:enumeration value="Xnet"/>
 *     &lt;xs:enumeration value="XOPEN-EULA"/>
 *     &lt;xs:enumeration value="X/Open-style"/>
 *     &lt;xs:enumeration value="Yahoo-EULA"/>
 *     &lt;xs:enumeration value="YaST(SuSE)"/>
 *     &lt;xs:enumeration value="YPL"/>
 *     &lt;xs:enumeration value="YPL-1.0"/>
 *     &lt;xs:enumeration value="YPL-1.1"/>
 *     &lt;xs:enumeration value="Zend-2.0"/>
 *     &lt;xs:enumeration value="Zeus"/>
 *     &lt;xs:enumeration value="Zimbra"/>
 *     &lt;xs:enumeration value="Zimbra-1.2"/>
 *     &lt;xs:enumeration value="Zimbra-1.3"/>
 *     &lt;xs:enumeration value="Zlib"/>
 *     &lt;xs:enumeration value="ZoneAlarm-EULA"/>
 *     &lt;xs:enumeration value="ZPL-1.0"/>
 *     &lt;xs:enumeration value="ZPL-1.1"/>
 *     &lt;xs:enumeration value="ZPL-2.0"/>
 *     &lt;xs:enumeration value="ZPL-2.1"/>
 *     &lt;xs:enumeration value="Zveno"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum LicenseCodeSimpleType {
    /** 
     * 3DFX License
     */
    _3_DFX("3DFX"), /** 
                     * 3DFX-PL License
                     */
    _3_DFXPL("3DFX-PL"), /** 
                          * AAL License
                          */
    AAL("AAL"), /** 
                 * ACAA License
                 */
    ACAA("ACAA"), /** 
                   * ACDL License
                   */
    ACDL("ACDL"), /** 
                   * ACE License
                   */
    ACE("ACE"), /** 
                 * Adaptec-GPL License
                 */
    ADAPTEC_GPL("Adaptec-GPL"), /** 
                                 * Adaptec(RESTRICTED) License
                                 */
    ADAPTEC_RESTRICTED("Adaptec(RESTRICTED)"), /** 
                                                * Adobe-AFM License
                                                */
    ADOBE_AFM("Adobe-AFM"), /** 
                             * Adobe-EULA License
                             */
    ADOBE_EULA("Adobe-EULA"), /** 
                               * AFL License
                               */
    AFL("AFL"), /** 
                 * AFL-1.0 License
                 */
    AF_L10("AFL-1.0"), /** 
                        * AFL-1.1 License
                        */
    AF_L11("AFL-1.1"), /** 
                        * AFL-1.2 License
                        */
    AF_L12("AFL-1.2"), /** 
                        * AFL-2.0 License
                        */
    AF_L20("AFL-2.0"), /** 
                        * AFL-2.1 License
                        */
    AF_L21("AFL-2.1"), /** 
                        * AFL-3.0 License
                        */
    AF_L30("AFL-3.0"), /** 
                        * AFPL-Ghostscript License
                        */
    AFPL_GHOSTSCRIPT("AFPL-Ghostscript"), /** 
                                           * AgainstDRM License
                                           */
    AGAINST_DRM("AgainstDRM"), /** 
                                * AGE-Logic License
                                */
    AGE_LOGIC("AGE-Logic"), /** 
                             * Agere-EULA License
                             */
    AGERE_EULA("Agere-EULA"), /** 
                               * AGFA-EULA License
                               */
    AGFAEULA("AGFA-EULA"), /** 
                            * AGFA(RESTRICTED) License
                            */
    AGFARESTRICTED("AGFA(RESTRICTED)"), /** 
                                         * AGPL License
                                         */
    AGPL("AGPL"), /** 
                   * AGPL-1.0 License
                   */
    AGP_L10("AGPL-1.0"), /** 
                          * AGPL-1.0+ License
                          */
    AGP_L10a("AGPL-1.0+"), /** 
                            * AGPL-3.0 License
                            */
    AGP_L30("AGPL-3.0"), /** 
                          * AGPL-3.0+ License
                          */
    AGP_L30a("AGPL-3.0+"), /** 
                            * Aladdin License
                            */
    ALADDIN("Aladdin"), /** 
                         * Alfresco License
                         */
    ALFRESCO("Alfresco"), /** 
                           * Alfresco/FLOSS License
                           */
    ALFRESCO_FLOSS("Alfresco/FLOSS"), /** 
                                       * Algorithmics License
                                       */
    ALGORITHMICS("Algorithmics"), /** 
                                   * AMD License
                                   */
    AMD("AMD"), /** 
                 * AMD-EULA License
                 */
    AMDEULA("AMD-EULA"), /** 
                          * ANTLR-PD License
                          */
    ANTLRPD("ANTLR-PD"), /** 
                          * AOL-EULA License
                          */
    AOLEULA("AOL-EULA"), /** 
                          * Apache License
                          */
    APACHE("Apache"), /** 
                       * Apache-1.0 License
                       */
    APACHE10("Apache-1.0"), /** 
                             * Apache-1.1 License
                             */
    APACHE11("Apache-1.1"), /** 
                             * Apache-2.0 License
                             */
    APACHE20("Apache-2.0"), /** 
                             * Apache-style License
                             */
    APACHESTYLE("Apache-style"), /** 
                                  * Apache-v1.0 License
                                  */
    APACHEV10("Apache-v1.0"), /** 
                               * APL License
                               */
    APL("APL"), /** 
                 * APL-1.0 License
                 */
    AP_L10("APL-1.0"), /** 
                        * Apple(FontForge) License
                        */
    APPLE_FONT_FORGE("Apple(FontForge)"), /** 
                                           * Apple(Sample) License
                                           */
    APPLE_SAMPLE("Apple(Sample)"), /** 
                                    * APSL License
                                    */
    APSL("APSL"), /** 
                   * APSL-1.0 License
                   */
    APS_L10("APSL-1.0"), /** 
                          * APSL-1.1 License
                          */
    APS_L11("APSL-1.1"), /** 
                          * APSL-1.2 License
                          */
    APS_L12("APSL-1.2"), /** 
                          * APSL-2.0 License
                          */
    APS_L20("APSL-2.0"), /** 
                          * APSL-style License
                          */
    APS_LSTYLE("APSL-style"), /** 
                               * Aptana License
                               */
    APTANA("Aptana"), /** 
                       * Aptana-1.0 License
                       */
    APTANA10("Aptana-1.0"), /** 
                             * ARJ License
                             */
    ARJ("ARJ"), /** 
                 * Arphic-Font-PL License
                 */
    ARPHIC_FONT_PL("Arphic-Font-PL"), /** 
                                       * Arphic-style License
                                       */
    ARPHICSTYLE("Arphic-style"), /** 
                                  * Artifex License
                                  */
    ARTIFEX("Artifex"), /** 
                         * Artistic-1.0-cl8 License
                         */
    ARTISTIC10CL8("Artistic-1.0-cl8"), /** 
                                        * Artistic-1.0-Perl License
                                        */
    ARTISTIC10_PERL("Artistic-1.0-Perl"), /** 
                                           * Ascender-EULA License
                                           */
    ASCENDER_EULA("Ascender-EULA"), /** 
                                     * ATI-EULA License
                                     */
    ATIEULA("ATI-EULA"), /** 
                          * ATMEL-FW License
                          */
    ATMELFW("ATMEL-FW"), /** 
                          * ATT(Non-commercial) License
                          */
    ATT_NONCOMMERCIAL("ATT(Non-commercial)"), /** 
                                               * ATT-Source License
                                               */
    ATT_SOURCE("ATT-Source"), /** 
                               * ATT-Source-1.0 License
                               */
    ATT_SOURCE10("ATT-Source-1.0"), /** 
                                     * ATT-Source-1.2d License
                                     */
    ATT_SOURCE12D("ATT-Source-1.2d"), /** 
                                       * Baekmuk-Font License
                                       */
    BAEKMUK_FONT("Baekmuk-Font"), /** 
                                   * Baekmuk(Hwan) License
                                   */
    BAEKMUK_HWAN("Baekmuk(Hwan)"), /** 
                                    * BancTec License
                                    */
    BANC_TEC("BancTec"), /** 
                          * Beerware License
                          */
    BEERWARE("Beerware"), /** 
                           * Bellcore License
                           */
    BELLCORE("Bellcore"), /** 
                           * Bellcore-style License
                           */
    BELLCORESTYLE("Bellcore-style"), /** 
                                      * BH-Font License
                                      */
    BH_FONT("BH-Font"), /** 
                         * BH-Font-style License
                         */
    BH_FONTSTYLE("BH-Font-style"), /** 
                                    * BISON License
                                    */
    BISON("BISON"), /** 
                     * BitTorrent License
                     */
    BIT_TORRENT("BitTorrent"), /** 
                                * BitTorrent-1.0 License
                                */
    BIT_TORRENT10("BitTorrent-1.0"), /** 
                                      * BitTorrent-1.1 License
                                      */
    BIT_TORRENT11("BitTorrent-1.1"), /** 
                                      * BIZNET License
                                      */
    BIZNET("BIZNET"), /** 
                       * BIZNET-style License
                       */
    BIZNE_TSTYLE("BIZNET-style"), /** 
                                   * BrainStorm-EULA License
                                   */
    BRAIN_STORM_EULA("BrainStorm-EULA"), /** 
                                          * Broadcom-EULA License
                                          */
    BROADCOM_EULA("Broadcom-EULA"), /** 
                                     * BSD-2-Clause License
                                     */
    BS_D2_CLAUSE("BSD-2-Clause"), /** 
                                   * BSD-2-Clause-FreeBSD License
                                   */
    BS_D2_CLAUSE_FREE_BSD("BSD-2-Clause-FreeBSD"), /** 
                                                    * BSD-2-Clause-NetBSD License
                                                    */
    BS_D2_CLAUSE_NET_BSD("BSD-2-Clause-NetBSD"), /** 
                                                  * BSD-3-Clause License
                                                  */
    BS_D3_CLAUSE("BSD-3-Clause"), /** 
                                   * BSD-3-Clause-Clear License
                                   */
    BS_D3_CLAUSE_CLEAR("BSD-3-Clause-Clear"), /** 
                                               * BSD-3-Clause-Severability License
                                               */
    BS_D3_CLAUSE_SEVERABILITY("BSD-3-Clause-Severability"), /** 
                                                             * BSD-4-Clause License
                                                             */
    BS_D4_CLAUSE("BSD-4-Clause"), /** 
                                   * BSD-4-Clause-UC License
                                   */
    BS_D4_CLAUSE_UC("BSD-4-Clause-UC"), /** 
                                         * BSL-1.0 License
                                         */
    BS_L10("BSL-1.0"), /** 
                        * BSL-style License
                        */
    BS_LSTYLE("BSL-style"), /** 
                             * CA License
                             */
    CA("CA"), /** 
               * Cadence License
               */
    CADENCE("Cadence"), /** 
                         * CATOSL License
                         */
    CATOSL("CATOSL"), /** 
                       * CATOSL-1.1 License
                       */
    CATOS_L11("CATOSL-1.1"), /** 
                              * CC0-1.0 License
                              */
    C_C010("CC0-1.0"), /** 
                        * CC-BY License
                        */
    CCBY("CC-BY"), /** 
                    * CC-BY-1.0 License
                    */
    CCB_Y10("CC-BY-1.0"), /** 
                           * CC-BY-2.0 License
                           */
    CCB_Y20("CC-BY-2.0"), /** 
                           * CC-BY-2.5 License
                           */
    CCB_Y25("CC-BY-2.5"), /** 
                           * CC-BY-3.0 License
                           */
    CCB_Y30("CC-BY-3.0"), /** 
                           * CC-BY-4.0 License
                           */
    CCB_Y40("CC-BY-4.0"), /** 
                           * CC-BY-NC-1.0 License
                           */
    CCBYN_C10("CC-BY-NC-1.0"), /** 
                                * CC-BY-NC-2.0 License
                                */
    CCBYN_C20("CC-BY-NC-2.0"), /** 
                                * CC-BY-NC-2.5 License
                                */
    CCBYN_C25("CC-BY-NC-2.5"), /** 
                                * CC-BY-NC-3.0 License
                                */
    CCBYN_C30("CC-BY-NC-3.0"), /** 
                                * CC-BY-NC-4.0 License
                                */
    CCBYN_C40("CC-BY-NC-4.0"), /** 
                                * CC-BY-NC-ND-1.0 License
                                */
    CCBYNCN_D10("CC-BY-NC-ND-1.0"), /** 
                                     * CC-BY-NC-ND-2.0 License
                                     */
    CCBYNCN_D20("CC-BY-NC-ND-2.0"), /** 
                                     * CC-BY-NC-ND-2.5 License
                                     */
    CCBYNCN_D25("CC-BY-NC-ND-2.5"), /** 
                                     * CC-BY-NC-ND-3.0 License
                                     */
    CCBYNCN_D30("CC-BY-NC-ND-3.0"), /** 
                                     * CC-BY-NC-ND-4.0 License
                                     */
    CCBYNCN_D40("CC-BY-NC-ND-4.0"), /** 
                                     * CC-BY-NC-SA-1.0 License
                                     */
    CCBYNCS_A10("CC-BY-NC-SA-1.0"), /** 
                                     * CC-BY-NC-SA-2.0 License
                                     */
    CCBYNCS_A20("CC-BY-NC-SA-2.0"), /** 
                                     * CC-BY-NC-SA-2.5 License
                                     */
    CCBYNCS_A25("CC-BY-NC-SA-2.5"), /** 
                                     * CC-BY-NC-SA-3.0 License
                                     */
    CCBYNCS_A30("CC-BY-NC-SA-3.0"), /** 
                                     * CC-BY-NC-SA-4.0 License
                                     */
    CCBYNCS_A40("CC-BY-NC-SA-4.0"), /** 
                                     * CC-BY-ND-1.0 License
                                     */
    CCBYN_D10("CC-BY-ND-1.0"), /** 
                                * CC-BY-ND-2.0 License
                                */
    CCBYN_D20("CC-BY-ND-2.0"), /** 
                                * CC-BY-ND-2.5 License
                                */
    CCBYN_D25("CC-BY-ND-2.5"), /** 
                                * CC-BY-ND-3.0 License
                                */
    CCBYN_D30("CC-BY-ND-3.0"), /** 
                                * CC-BY-ND-4.0 License
                                */
    CCBYN_D40("CC-BY-ND-4.0"), /** 
                                * CC-BY-SA License
                                */
    CCBYSA("CC-BY-SA"), /** 
                         * CC-BY-SA-1.0 License
                         */
    CCBYS_A10("CC-BY-SA-1.0"), /** 
                                * CC-BY-SA-2.0 License
                                */
    CCBYS_A20("CC-BY-SA-2.0"), /** 
                                * CC-BY-SA-2.5 License
                                */
    CCBYS_A25("CC-BY-SA-2.5"), /** 
                                * CC-BY-SA-3.0 License
                                */
    CCBYS_A30("CC-BY-SA-3.0"), /** 
                                * CC-BY-SA-4.0 License
                                */
    CCBYS_A40("CC-BY-SA-4.0"), /** 
                                * CC-LGPL License
                                */
    CCLGPL("CC-LGPL"), /** 
                        * CC-LGPL-2.1 License
                        */
    CCLGP_L21("CC-LGPL-2.1"), /** 
                               * CCLRC License
                               */
    CCLRC("CCLRC"), /** 
                     * CCPL License
                     */
    CCPL("CCPL"), /** 
                   * CDDL License
                   */
    CDDL("CDDL"), /** 
                   * CDDL-1.0 License
                   */
    CDD_L10("CDDL-1.0"), /** 
                          * CDDL-1.1 License
                          */
    CDD_L11("CDDL-1.1"), /** 
                          * CECILL License
                          */
    CECILL("CECILL"), /** 
                       * CECILL-2.0 License
                       */
    CECIL_L20("CECILL-2.0"), /** 
                              * CECILL-B License
                              */
    CECILLB("CECILL-B"), /** 
                          * CECILL-C License
                          */
    CECILLC("CECILL-C"), /** 
                          * CECILL(dual) License
                          */
    CECIL_LDUAL("CECILL(dual)"), /** 
                                  * Cisco License
                                  */
    CISCO("Cisco"), /** 
                     * Cisco-style License
                     */
    CISCOSTYLE("Cisco-style"), /** 
                                * Citrix License
                                */
    CITRIX("Citrix"), /** 
                       * ClArtistic License
                       */
    CL_ARTISTIC("ClArtistic"), /** 
                                * ClearSilver License
                                */
    CLEAR_SILVER("ClearSilver"), /** 
                                  * CMake License
                                  */
    C_MAKE("CMake"), /** 
                      * CMU-style License
                      */
    CM_USTYLE("CMU-style"), /** 
                             * CNRI-Python License
                             */
    CNRI_PYTHON("CNRI-Python"), /** 
                                 * CNRI-Python-GPL-Compatible License
                                 */
    CNRI_PYTHON_GPL_COMPATIBLE("CNRI-Python-GPL-Compatible"), /** 
                                                               * Combined_OpenSSL+SSLeay License
                                                               */
    COMBINED_OPEN_SSLSS_LEAY("Combined_OpenSSL+SSLeay"), /** 
                                                          * CompuServe License
                                                          */
    COMPU_SERVE("CompuServe"), /** 
                                * Comtrol License
                                */
    COMTROL("Comtrol"), /** 
                         * Condor-1.0 License
                         */
    CONDOR10("Condor-1.0"), /** 
                             * Condor-1.1 License
                             */
    CONDOR11("Condor-1.1"), /** 
                             * CopyLeft[1] License
                             */
    COPY_LEFT1("CopyLeft[1]"), /** 
                                * CopyLeft[2] License
                                */
    COPY_LEFT2("CopyLeft[2]"), /** 
                                * CPL License
                                */
    CPL("CPL"), /** 
                 * CPL-0.5 License
                 */
    CP_L05("CPL-0.5"), /** 
                        * CPL-1.0 License
                        */
    CP_L10("CPL-1.0"), /** 
                        * CPOL License
                        */
    CPOL("CPOL"), /** 
                   * CPOL-1.02 License
                   */
    CPO_L102("CPOL-1.02"), /** 
                            * Cryptogams License
                            */
    CRYPTOGAMS("Cryptogams"), /** 
                               * CUA-OPL-1.0 License
                               */
    CUAOP_L10("CUA-OPL-1.0"), /** 
                               * CUPS License
                               */
    CUPS("CUPS"), /** 
                   * CUPS-EULA License
                   */
    CUPSEULA("CUPS-EULA"), /** 
                            * Cylink-ISC License
                            */
    CYLINK_ISC("Cylink-ISC"), /** 
                               * Cypress-FW License
                               */
    CYPRESS_FW("Cypress-FW"), /** 
                               * DARPA License
                               */
    DARPA("DARPA"), /** 
                     * DARPA-Cougaar License
                     */
    DARPA_COUGAAR("DARPA-Cougaar"), /** 
                                     * Debian-social-DFSG License
                                     */
    DEBIANSOCIAL_DFSG("Debian-social-DFSG"), /** 
                                              * Debian-SPI License
                                              */
    DEBIAN_SPI("Debian-SPI"), /** 
                               * Debian-SPI-style License
                               */
    DEBIAN_SP_ISTYLE("Debian-SPI-style"), /** 
                                           * D-FSL-1.0 License
                                           */
    DFS_L10("D-FSL-1.0"), /** 
                           * DMTF License
                           */
    DMTF("DMTF"), /** 
                   * DOCBOOK License
                   */
    DOCBOOK("DOCBOOK"), /** 
                         * DOCBOOK-style License
                         */
    DOCBOO_KSTYLE("DOCBOOK-style"), /** 
                                     * DPTC License
                                     */
    DPTC("DPTC"), /** 
                   * DSCT License
                   */
    DSCT("DSCT"), /** 
                   * DSL License
                   */
    DSL("DSL"), /** 
                 * Dyade License
                 */
    DYADE("Dyade"), /** 
                     * EBT-style License
                     */
    EB_TSTYLE("EBT-style"), /** 
                             * ECL-1.0 License
                             */
    EC_L10("ECL-1.0"), /** 
                        * ECL-2.0 License
                        */
    EC_L20("ECL-2.0"), /** 
                        * eCos-2.0 License
                        */
    E_COS20("eCos-2.0"), /** 
                          * EFL License
                          */
    EFL("EFL"), /** 
                 * EFL-1.0 License
                 */
    EF_L10("EFL-1.0"), /** 
                        * EFL-2.0 License
                        */
    EF_L20("EFL-2.0"), /** 
                        * eGenix License
                        */
    E_GENIX("eGenix"), /** 
                        * Empty-file-no-data! License
                        */
    EMPTYFILENODATA("Empty-file-no-data!"), /** 
                                             * Entessa License
                                             */
    ENTESSA("Entessa"), /** 
                         * Epinions License
                         */
    EPINIONS("Epinions"), /** 
                           * Epson-EULA License
                           */
    EPSON_EULA("Epson-EULA"), /** 
                               * Epson-PL License
                               */
    EPSON_PL("Epson-PL"), /** 
                           * ErlPL-1.1 License
                           */
    ERL_P_L11("ErlPL-1.1"), /** 
                             * EUDatagrid License
                             */
    EU_DATAGRID("EUDatagrid"), /** 
                                * EUPL-1.0 License
                                */
    EUP_L10("EUPL-1.0"), /** 
                          * EUPL-1.1 License
                          */
    EUP_L11("EUPL-1.1"), /** 
                          * FaCE License
                          */
    FA_CE("FaCE"), /** 
                    * Fair License
                    */
    FAIR("Fair"), /** 
                   * Fair-style License
                   */
    FAIRSTYLE("Fair-style"), /** 
                              * FAL-1.0 License
                              */
    FA_L10("FAL-1.0"), /** 
                        * FAL-1.3 License
                        */
    FA_L13("FAL-1.3"), /** 
                        * FedoraCLA License
                        */
    FEDORA_CLA("FedoraCLA"), /** 
                              * Flash2xml-1.0 License
                              */
    FLASH2XML10("Flash2xml-1.0"), /** 
                                   * Flora License
                                   */
    FLORA("Flora"), /** 
                     * Flora-1.0 License
                     */
    FLORA10("Flora-1.0"), /** 
                           * Flora-1.1 License
                           */
    FLORA11("Flora-1.1"), /** 
                           * Frameworx License
                           */
    FRAMEWORX("Frameworx"), /** 
                             * Frameworx-1.0 License
                             */
    FRAMEWORX10("Frameworx-1.0"), /** 
                                   * FreeBSD-Doc License
                                   */
    FREE_BSD_DOC("FreeBSD-Doc"), /** 
                                  * Free-PL License
                                  */
    FREE_PL("Free-PL"), /** 
                         * Free-SW License
                         */
    FREE_SW("Free-SW"), /** 
                         * FTL License
                         */
    FTL("FTL"), /** 
                 * FTL-style License
                 */
    FT_LSTYLE("FTL-style"), /** 
                             * Fujitsu License
                             */
    FUJITSU("Fujitsu"), /** 
                         * Garmin-EULA License
                         */
    GARMIN_EULA("Garmin-EULA"), /** 
                                 * Genivia(Commercial) License
                                 */
    GENIVIA_COMMERCIAL("Genivia(Commercial)"), /** 
                                                * GFDL License
                                                */
    GFDL("GFDL"), /** 
                   * GFDL-1.1 License
                   */
    GFD_L11("GFDL-1.1"), /** 
                          * GFDL-1.1+ License
                          */
    GFD_L11a("GFDL-1.1+"), /** 
                            * GFDL-1.2 License
                            */
    GFD_L12("GFDL-1.2"), /** 
                          * GFDL-1.2+ License
                          */
    GFD_L12a("GFDL-1.2+"), /** 
                            * GFDL-1.3 License
                            */
    GFD_L13("GFDL-1.3"), /** 
                          * GFDL-v1.2 License
                          */
    GFD_LV12("GFDL-v1.2"), /** 
                            * Ghostscript-GPL-1.1 License
                            */
    GHOSTSCRIPT_GP_L11("Ghostscript-GPL-1.1"), /** 
                                                * Giftware License
                                                */
    GIFTWARE("Giftware"), /** 
                           * GNU-copyleft License
                           */
    GN_UCOPYLEFT("GNU-copyleft"), /** 
                                   * GNU-Ghostscript License
                                   */
    GNU_GHOSTSCRIPT("GNU-Ghostscript"), /** 
                                         * GNU-javamail-exception License
                                         */
    GN_UJAVAMAILEXCEPTION("GNU-javamail-exception"), /** 
                                                      * GNU-Manpages License
                                                      */
    GNU_MANPAGES("GNU-Manpages"), /** 
                                   * Google-BSD License
                                   */
    GOOGLE_BSD("Google-BSD"), /** 
                               * Govt-restrict License
                               */
    GOVTRESTRICT("Govt-restrict"), /** 
                                    * GPL License
                                    */
    GPL("GPL"), /** 
                 * GPL-1.0 License
                 */
    GP_L10("GPL-1.0"), /** 
                        * GPL-1.0+ License
                        */
    GP_L10a("GPL-1.0+"), /** 
                          * GPL-2.0 License
                          */
    GP_L20("GPL-2.0"), /** 
                        * GPL-2.0+ License
                        */
    GP_L20a("GPL-2.0+"), /** 
                          * GPL-2.0:3.0 License
                          */
    GP_L2030("GPL-2.0:3.0"), /** 
                              * GPL-2.0+:3.0 License
                              */
    GP_L2030a("GPL-2.0+:3.0"), /** 
                                * GPL-2.0+KDEupgradeClause License
                                */
    GP_L20_KD_EUPGRADE_CLAUSE("GPL-2.0+KDEupgradeClause"), /** 
                                                            * GPL-2.0-with-autoconf-exception License
                                                            */
    GP_L20WITHAUTOCONFEXCEPTION("GPL-2.0-with-autoconf-exception"), /** 
                                                                     * GPL-2.0-with-bison-exception License
                                                                     */
    GP_L20WITHBISONEXCEPTION("GPL-2.0-with-bison-exception"), /** 
                                                               * GPL-2.0+-with-bison-exception License
                                                               */
    GP_L20WITHBISONEXCEPTION1("GPL-2.0+-with-bison-exception"), /** 
                                                                 * GPL-2.0-with-classpath-exception License
                                                                 */
    GP_L20WITHCLASSPATHEXCEPTION("GPL-2.0-with-classpath-exception"), /** 
                                                                       * GPL-2.0+-with-classpath-exception License
                                                                       */
    GP_L20WITHCLASSPATHEXCEPTION1("GPL-2.0+-with-classpath-exception"), /** 
                                                                         * GPL-2.0-with-font-exception License
                                                                         */
    GP_L20WITHFONTEXCEPTION("GPL-2.0-with-font-exception"), /** 
                                                             * GPL-2.0-with-GCC-exception License
                                                             */
    GP_L20WITH_GC_CEXCEPTION("GPL-2.0-with-GCC-exception"), /** 
                                                             * GPL-2.1[sic] License
                                                             */
    GP_L21SIC("GPL-2.1[sic]"), /** 
                                * GPL-2.1+[sic] License
                                */
    GP_L21SIC1("GPL-2.1+[sic]"), /** 
                                  * GPL-3? License
                                  */
    GP_L3("GPL-3?"), /** 
                      * GPL-3.0 License
                      */
    GP_L30("GPL-3.0"), /** 
                        * GPL-3.0+ License
                        */
    GP_L30a("GPL-3.0+"), /** 
                          * GPL-3.0-with-autoconf-exception License
                          */
    GP_L30WITHAUTOCONFEXCEPTION("GPL-3.0-with-autoconf-exception"), /** 
                                                                     * GPL-3.0-with-GCC-exception License
                                                                     */
    GP_L30WITH_GC_CEXCEPTION("GPL-3.0-with-GCC-exception"), /** 
                                                             * GPL-3.0+-with-GCC-exception License
                                                             */
    GP_L30WITH_GC_CEXCEPTION1("GPL-3.0+-with-GCC-exception"), /** 
                                                               * GPL-Meta License
                                                               */
    GPL_META("GPL-Meta"), /** 
                           * GPL-or-LGPL License
                           */
    GP_LOR_LGPL("GPL-or-LGPL"), /** 
                                 * GPL(rms) License
                                 */
    GP_LRMS("GPL(rms)"), /** 
                          * GPL-with-autoconf-exception License
                          */
    GP_LWITHAUTOCONFEXCEPTION("GPL-with-autoconf-exception"), /** 
                                                               * gSOAP License
                                                               */
    G_SOAP("gSOAP"), /** 
                      * gSOAP-1.3b License
                      */
    G_SOA_P13B("gSOAP-1.3b"), /** 
                               * H2 License
                               */
    H2("H2"), /** 
               * H2-1.0 License
               */
    H210("H2-1.0"), /** 
                     * Hacktivismo License
                     */
    HACKTIVISMO("Hacktivismo"), /** 
                                 * Hauppauge License
                                 */
    HAUPPAUGE("Hauppauge"), /** 
                             * Helix/RealNetworks-EULA License
                             */
    HELIX_REAL_NETWORKS_EULA("Helix/RealNetworks-EULA"), /** 
                                                          * HPND License
                                                          */
    HPND("HPND"), /** 
                   * IBM-Courier License
                   */
    IBM_COURIER("IBM-Courier"), /** 
                                 * IBM-JCL License
                                 */
    IBMJCL("IBM-JCL"), /** 
                        * IBM-pibs License
                        */
    IB_MPIBS("IBM-pibs"), /** 
                           * IBM-reciprocal License
                           */
    IB_MRECIPROCAL("IBM-reciprocal"), /** 
                                       * ID-EULA License
                                       */
    IDEULA("ID-EULA"), /** 
                        * IDPL License
                        */
    IDPL("IDPL"), /** 
                   * IDPL-1.0 License
                   */
    IDP_L10("IDPL-1.0"), /** 
                          * IEEE-Doc License
                          */
    IEEE_DOC("IEEE-Doc"), /** 
                           * IETF License
                           */
    IETF("IETF"), /** 
                   * IETF-style License
                   */
    IET_FSTYLE("IETF-style"), /** 
                               * IJG License
                               */
    IJG("IJG"), /** 
                 * ImageMagick License
                 */
    IMAGE_MAGICK("ImageMagick"), /** 
                                  * ImageMagick(Apache) License
                                  */
    IMAGE_MAGICK_APACHE("ImageMagick(Apache)"), /** 
                                                 * ImageMagick-style License
                                                 */
    IMAGE_MAGICKSTYLE("ImageMagick-style"), /** 
                                             * Imlib2 License
                                             */
    IMLIB2("Imlib2"), /** 
                       * InfoSeek License
                       */
    INFO_SEEK("InfoSeek"), /** 
                            * info-zip License
                            */
    INFOZIP("info-zip"), /** 
                          * InnerNet License
                          */
    INNER_NET("InnerNet"), /** 
                            * InnerNet-2.00 License
                            */
    INNER_NET200("InnerNet-2.00"), /** 
                                    * InnerNet-style License
                                    */
    INNER_NETSTYLE("InnerNet-style"), /** 
                                       * Intel-EULA License
                                       */
    INTEL_EULA("Intel-EULA"), /** 
                               * Intel(RESTRICTED) License
                               */
    INTEL_RESTRICTED("Intel(RESTRICTED)"), /** 
                                            * Intel-WLAN License
                                            */
    INTEL_WLAN("Intel-WLAN"), /** 
                               * Interbase-1.0 License
                               */
    INTERBASE10("Interbase-1.0"), /** 
                                   * Interbase-PL License
                                   */
    INTERBASE_PL("Interbase-PL"), /** 
                                   * Interlink-EULA License
                                   */
    INTERLINK_EULA("Interlink-EULA"), /** 
                                       * Intranet-only License
                                       */
    INTRANETONLY("Intranet-only"), /** 
                                    * IOS License
                                    */
    IOS("IOS"), /** 
                 * IoSoft(COMMERCIAL) License
                 */
    IO_SOFT_COMMERCIAL("IoSoft(COMMERCIAL)"), /** 
                                               * IPA License
                                               */
    IPA("IPA"), /** 
                 * IPA-Font-EULA License
                 */
    IPA_FONT_EULA("IPA-Font-EULA"), /** 
                                     * IPL License
                                     */
    IPL("IPL"), /** 
                 * IPL-1.0 License
                 */
    IP_L10("IPL-1.0"), /** 
                        * IPL-2.0 License
                        */
    IP_L20("IPL-2.0"), /** 
                        * IPTC License
                        */
    IPTC("IPTC"), /** 
                   * IronDoc License
                   */
    IRON_DOC("IronDoc"), /** 
                          * ISC License
                          */
    ISC("ISC"), /** 
                 * Jabber License
                 */
    JABBER("Jabber"), /** 
                       * Java-WSDL4J License
                       */
    JAVA_WSD_L4_J("Java-WSDL4J"), /** 
                                   * Java-WSDL-Policy License
                                   */
    JAVA_WSDL_POLICY("Java-WSDL-Policy"), /** 
                                           * Java-WSDL-Schema License
                                           */
    JAVA_WSDL_SCHEMA("Java-WSDL-Schema"), /** 
                                           * Java-WSDL-Spec License
                                           */
    JAVA_WSDL_SPEC("Java-WSDL-Spec"), /** 
                                       * JISP License
                                       */
    JISP("JISP"), /** 
                   * JPNIC License
                   */
    JPNIC("JPNIC"), /** 
                     * JSON License
                     */
    JSON("JSON"), /** 
                   * KDE License
                   */
    KDE("KDE"), /** 
                 * Keyspan-FW License
                 */
    KEYSPAN_FW("Keyspan-FW"), /** 
                               * KnowledgeTree-1.1 License
                               */
    KNOWLEDGE_TREE11("KnowledgeTree-1.1"), /** 
                                            * Knuth-style License
                                            */
    KNUTHSTYLE("Knuth-style"), /** 
                                * Lachman-Proprietary License
                                */
    LACHMAN_PROPRIETARY("Lachman-Proprietary"), /** 
                                                 * Larabie-EULA License
                                                 */
    LARABIE_EULA("Larabie-EULA"), /** 
                                   * LDP-1A License
                                   */
    LD_P1_A("LDP-1A"), /** 
                        * LDP-2.0 License
                        */
    LD_P20("LDP-2.0"), /** 
                        * Legato License
                        */
    LEGATO("Legato"), /** 
                       * Leptonica License
                       */
    LEPTONICA("Leptonica"), /** 
                             * LGPL License
                             */
    LGPL("LGPL"), /** 
                   * LGPL-1.0 License
                   */
    LGP_L10("LGPL-1.0"), /** 
                          * LGPL-1.0+ License
                          */
    LGP_L10a("LGPL-1.0+"), /** 
                            * LGPL-2.0 License
                            */
    LGP_L20("LGPL-2.0"), /** 
                          * LGPL-2.0+ License
                          */
    LGP_L20a("LGPL-2.0+"), /** 
                            * LGPL-2.1 License
                            */
    LGP_L21("LGPL-2.1"), /** 
                          * LGPL-2.1+ License
                          */
    LGP_L21a("LGPL-2.1+"), /** 
                            * LGPL-2.1+-KDE-exception License
                            */
    LGP_L21_KD_EEXCEPTION("LGPL-2.1+-KDE-exception"), /** 
                                                       * LGPL-3? License
                                                       */
    LGP_L3("LGPL-3?"), /** 
                        * LGPL-3.0 License
                        */
    LGP_L30("LGPL-3.0"), /** 
                          * LGPL-3.0+ License
                          */
    LGP_L30a("LGPL-3.0+"), /** 
                            * LIBGCJ License
                            */
    LIBGCJ("LIBGCJ"), /** 
                       * Libpng License
                       */
    LIBPNG("Libpng"), /** 
                       * Link-exception License
                       */
    LINKEXCEPTION("Link-exception"), /** 
                                      * LinuxDoc License
                                      */
    LINUX_DOC("LinuxDoc"), /** 
                            * Linux-HOWTO License
                            */
    LINUX_HOWTO("Linux-HOWTO"), /** 
                                 * Logica-OSL-1.0 License
                                 */
    LOGICA_OS_L10("Logica-OSL-1.0"), /** 
                                      * LPL-1.0 License
                                      */
    LP_L10("LPL-1.0"), /** 
                        * LPL-1.02 License
                        */
    LP_L102("LPL-1.02"), /** 
                          * LPPL License
                          */
    LPPL("LPPL"), /** 
                   * LPPL-1.0 License
                   */
    LPP_L10("LPPL-1.0"), /** 
                          * LPPL-1.0+ License
                          */
    LPP_L10a("LPPL-1.0+"), /** 
                            * LPPL-1.1 License
                            */
    LPP_L11("LPPL-1.1"), /** 
                          * LPPL-1.1+ License
                          */
    LPP_L11a("LPPL-1.1+"), /** 
                            * LPPL-1.2 License
                            */
    LPP_L12("LPPL-1.2"), /** 
                          * LPPL-1.2+ License
                          */
    LPP_L12a("LPPL-1.2+"), /** 
                            * LPPL-1.3 License
                            */
    LPP_L13("LPPL-1.3"), /** 
                          * LPPL-1.3+ License
                          */
    LPP_L13a("LPPL-1.3+"), /** 
                            * LPPL-1.3a License
                            */
    LPP_L13A("LPPL-1.3a"), /** 
                            * LPPL-1.3a+ License
                            */
    LPP_L13A1("LPPL-1.3a+"), /** 
                              * LPPL-1.3b License
                              */
    LPP_L13B("LPPL-1.3b"), /** 
                            * LPPL-1.3b+ License
                            */
    LPP_L13B1("LPPL-1.3b+"), /** 
                              * LPPL-1.3c License
                              */
    LPP_L13C("LPPL-1.3c"), /** 
                            * LPPL-1.3c+ License
                            */
    LPP_L13C1("LPPL-1.3c+"), /** 
                              * MacroMedia-RPSL License
                              */
    MACRO_MEDIA_RPSL("MacroMedia-RPSL"), /** 
                                          * Macrovision License
                                          */
    MACROVISION("Macrovision"), /** 
                                 * Macrovision-EULA License
                                 */
    MACROVISION_EULA("Macrovision-EULA"), /** 
                                           * Majordomo License
                                           */
    MAJORDOMO("Majordomo"), /** 
                             * Majordomo-1.1 License
                             */
    MAJORDOMO11("Majordomo-1.1"), /** 
                                   * Mandriva License
                                   */
    MANDRIVA("Mandriva"), /** 
                           * Mellanox License
                           */
    MELLANOX("Mellanox"), /** 
                           * MetroLink License
                           */
    METRO_LINK("MetroLink"), /** 
                              * MetroLink-nonfree License
                              */
    METRO_LINKNONFREE("MetroLink-nonfree"), /** 
                                             * Mibble License
                                             */
    MIBBLE("Mibble"), /** 
                       * Mibble-2.8 License
                       */
    MIBBLE28("Mibble-2.8"), /** 
                             * Microsoft License
                             */
    MICROSOFT("Microsoft"), /** 
                             * Migemo License
                             */
    MIGEMO("Migemo"), /** 
                       * MindTerm License
                       */
    MIND_TERM("MindTerm"), /** 
                            * MirOS License
                            */
    MIR_OS("MirOS"), /** 
                      * MITEM License
                      */
    MITEM("MITEM"), /** 
                     * MitreCVW-style License
                     */
    MITRE_CV_WSTYLE("MitreCVW-style"), /** 
                                        * Motosoto License
                                        */
    MOTOSOTO("Motosoto"), /** 
                           * MPEG3-decoder License
                           */
    MPE_G3DECODER("MPEG3-decoder"), /** 
                                     * MPL License
                                     */
    MPL("MPL"), /** 
                 * MPL-1.0 License
                 */
    MP_L10("MPL-1.0"), /** 
                        * MPL-1.1 License
                        */
    MP_L11("MPL-1.1"), /** 
                        * MPL-1.1+ License
                        */
    MP_L11a("MPL-1.1+"), /** 
                          * MPL-1.1-style License
                          */
    MP_L11STYLE("MPL-1.1-style"), /** 
                                   * MPL-2.0 License
                                   */
    MP_L20("MPL-2.0"), /** 
                        * MPL-2.0-no-copyleft-exception License
                        */
    MP_L20NOCOPYLEFTEXCEPTION("MPL-2.0-no-copyleft-exception"), /** 
                                                                 * MPL-EULA-1.1 License
                                                                 */
    MPLEUL_A11("MPL-EULA-1.1"), /** 
                                 * MPL-EULA-2.0 License
                                 */
    MPLEUL_A20("MPL-EULA-2.0"), /** 
                                 * MPL-EULA-3.0 License
                                 */
    MPLEUL_A30("MPL-EULA-3.0"), /** 
                                 * MPL-style License
                                 */
    MP_LSTYLE("MPL-style"), /** 
                             * M-Plus-Project License
                             */
    M_PLUS_PROJECT("M-Plus-Project"), /** 
                                       * MRL License
                                       */
    MRL("MRL"), /** 
                 * MS-indemnity License
                 */
    M_SINDEMNITY("MS-indemnity"), /** 
                                   * MS-LPL License
                                   */
    MSLPL("MS-LPL"), /** 
                      * MS-LRL License
                      */
    MSLRL("MS-LRL"), /** 
                      * Multics License
                      */
    MULTICS("Multics"), /** 
                         * MX4J License
                         */
    M_X4_J("MX4J"), /** 
                     * MX4J-1.0 License
                     */
    M_X4_J10("MX4J-1.0"), /** 
                           * MySQL-0.3 License
                           */
    MY_SQ_L03("MySQL-0.3"), /** 
                             * MySQL/FLOSS License
                             */
    MY_SQLFLOSS("MySQL/FLOSS"), /** 
                                 * MySQL-style License
                                 */
    MY_SQ_LSTYLE("MySQL-style"), /** 
                                  * NASA License
                                  */
    NASA("NASA"), /** 
                   * NASA-1.3 License
                   */
    NAS_A13("NASA-1.3"), /** 
                          * Naumen License
                          */
    NAUMEN("Naumen"), /** 
                       * NBPL-1.0 License
                       */
    NBP_L10("NBPL-1.0"), /** 
                          * nCipher License
                          */
    N_CIPHER("nCipher"), /** 
                          * NCSA License
                          */
    NCSA("NCSA"), /** 
                   * NESSUS-EULA License
                   */
    NESSUSEULA("NESSUS-EULA"), /** 
                                * NGPL License
                                */
    NGPL("NGPL"), /** 
                   * Nokia License
                   */
    NOKIA("Nokia"), /** 
                     * No_license_found License
                     */
    NO_LICENSE_FOUND("No_license_found"), /** 
                                           * non-ATT-BSD License
                                           */
    NON_ATTBSD("non-ATT-BSD"), /** 
                                * None License
                                */
    NONE("None"), /** 
                   * NOSL-1.0 License
                   */
    NOS_L10("NOSL-1.0"), /** 
                          * Not-for-sale! License
                          */
    NOTFORSALE("Not-for-sale!"), /** 
                                  * Not-Free! License
                                  */
    NOT_FREE("Not-Free!"), /** 
                            * Not-Internet License
                            */
    NOT_INTERNET("Not-Internet"), /** 
                                   * Not-OpenSource! License
                                   */
    NOT_OPEN_SOURCE("Not-OpenSource!"), /** 
                                         * NOT-Open-Source! License
                                         */
    NOT_OPEN_SOURCE1("NOT-Open-Source!"), /** 
                                           * NOT-public-domain License
                                           */
    NO_TPUBLICDOMAIN("NOT-public-domain"), /** 
                                            * Novell License
                                            */
    NOVELL("Novell"), /** 
                       * Novell-EULA License
                       */
    NOVELL_EULA("Novell-EULA"), /** 
                                 * NPL License
                                 */
    NPL("NPL"), /** 
                 * NPL-1.0 License
                 */
    NP_L10("NPL-1.0"), /** 
                        * NPL-1.1 License
                        */
    NP_L11("NPL-1.1"), /** 
                        * NPL-1.1+ License
                        */
    NP_L11a("NPL-1.1+"), /** 
                          * NPL-EULA License
                          */
    NPLEULA("NPL-EULA"), /** 
                          * NPOSL-3.0 License
                          */
    NPOS_L30("NPOSL-3.0"), /** 
                            * NRL License
                            */
    NRL("NRL"), /** 
                 * NTP License
                 */
    NTP("NTP"), /** 
                 * OASIS License
                 */
    OASIS("OASIS"), /** 
                     * OCL License
                     */
    OCL("OCL"), /** 
                 * OCL-1.0 License
                 */
    OC_L10("OCL-1.0"), /** 
                        * OCLC License
                        */
    OCLC("OCLC"), /** 
                   * OCLC-1.0 License
                   */
    OCL_C10("OCLC-1.0"), /** 
                          * OCLC-2.0 License
                          */
    OCL_C20("OCLC-2.0"), /** 
                          * OCL-style License
                          */
    OC_LSTYLE("OCL-style"), /** 
                             * ODbL-1.0 License
                             */
    O_DB_L10("ODbL-1.0"), /** 
                           * ODL License
                           */
    ODL("ODL"), /** 
                 * OFL-1.0 License
                 */
    OF_L10("OFL-1.0"), /** 
                        * OFL-1.1 License
                        */
    OF_L11("OFL-1.1"), /** 
                        * OGTSL License
                        */
    OGTSL("OGTSL"), /** 
                     * OLDAP License
                     */
    OLDAP("OLDAP"), /** 
                     * OLDAP-1.1 License
                     */
    OLDA_P11("OLDAP-1.1"), /** 
                            * OLDAP-1.2 License
                            */
    OLDA_P12("OLDAP-1.2"), /** 
                            * OLDAP-1.3 License
                            */
    OLDA_P13("OLDAP-1.3"), /** 
                            * OLDAP-1.4 License
                            */
    OLDA_P14("OLDAP-1.4"), /** 
                            * OLDAP-2.0 License
                            */
    OLDA_P20("OLDAP-2.0"), /** 
                            * OLDAP-2.0.1 License
                            */
    OLDA_P201("OLDAP-2.0.1"), /** 
                               * OLDAP-2.1 License
                               */
    OLDA_P21("OLDAP-2.1"), /** 
                            * OLDAP-2.2 License
                            */
    OLDA_P22("OLDAP-2.2"), /** 
                            * OLDAP-2.2.1 License
                            */
    OLDA_P221("OLDAP-2.2.1"), /** 
                               * OLDAP-2.2.2 License
                               */
    OLDA_P222("OLDAP-2.2.2"), /** 
                               * OLDAP-2.3 License
                               */
    OLDA_P23("OLDAP-2.3"), /** 
                            * OLDAP-2.4 License
                            */
    OLDA_P24("OLDAP-2.4"), /** 
                            * OLDAP-2.5 License
                            */
    OLDA_P25("OLDAP-2.5"), /** 
                            * OLDAP-2.6 License
                            */
    OLDA_P26("OLDAP-2.6"), /** 
                            * OLDAP-2.7 License
                            */
    OLDA_P27("OLDAP-2.7"), /** 
                            * OLDAP-2.8 License
                            */
    OLDA_P28("OLDAP-2.8"), /** 
                            * OLDAP-style License
                            */
    OLDA_PSTYLE("OLDAP-style"), /** 
                                 * OMF License
                                 */
    OMF("OMF"), /** 
                 * Ontopia License
                 */
    ONTOPIA("Ontopia"), /** 
                         * OpenCASCADE-PL License
                         */
    OPEN_CASCADEPL("OpenCASCADE-PL"), /** 
                                       * OpenGroup License
                                       */
    OPEN_GROUP("OpenGroup"), /** 
                              * OpenGroup-Proprietary License
                              */
    OPEN_GROUP_PROPRIETARY("OpenGroup-Proprietary"), /** 
                                                      * OpenMarket License
                                                      */
    OPEN_MARKET("OpenMarket"), /** 
                                * Open-PL License
                                */
    OPEN_PL("Open-PL"), /** 
                         * Open-PL-0.4 License
                         */
    OPEN_P_L04("Open-PL-0.4"), /** 
                                * Open-PL-1.0 License
                                */
    OPEN_P_L10("Open-PL-1.0"), /** 
                                * Open-PL-style License
                                */
    OPEN_P_LSTYLE("Open-PL-style"), /** 
                                     * OPL-1.0 License
                                     */
    OP_L10("OPL-1.0"), /** 
                        * Oracle-Berkeley-DB License
                        */
    ORACLE_BERKELEY_DB("Oracle-Berkeley-DB"), /** 
                                               * O'Reilly License
                                               */
    O_REILLY("O'Reilly"), /** 
                           * O'Reilly-style License
                           */
    O_REILLYSTYLE("O'Reilly-style"), /** 
                                      * OSD License
                                      */
    OSD("OSD"), /** 
                 * OSL License
                 */
    OSL("OSL"), /** 
                 * OSL-1.0 License
                 */
    OS_L10("OSL-1.0"), /** 
                        * OSL-1.1 License
                        */
    OS_L11("OSL-1.1"), /** 
                        * OSL-2.0 License
                        */
    OS_L20("OSL-2.0"), /** 
                        * OSL-2.1 License
                        */
    OS_L21("OSL-2.1"), /** 
                        * OSL-3.0 License
                        */
    OS_L30("OSL-3.0"), /** 
                        * Paradigm License
                        */
    PARADIGM("Paradigm"), /** 
                           * Patent-ref License
                           */
    PATENTREF("Patent-ref"), /** 
                              * PDDL-1.0 License
                              */
    PDD_L10("PDDL-1.0"), /** 
                          * Phorum License
                          */
    PHORUM("Phorum"), /** 
                       * PHP-3.0 License
                       */
    PH_P30("PHP-3.0"), /** 
                        * PHP-style License
                        */
    PH_PSTYLE("PHP-style"), /** 
                             * Piriform License
                             */
    PIRIFORM("Piriform"), /** 
                           * Pixware-EULA License
                           */
    PIXWARE_EULA("Pixware-EULA"), /** 
                                   * Polyserve-CONFIDENTIAL License
                                   */
    POLYSERVE_CONFIDENTIAL("Polyserve-CONFIDENTIAL"), /** 
                                                       * Postfix License
                                                       */
    POSTFIX("Postfix"), /** 
                         * PostgreSQL License
                         */
    POSTGRE_SQL("PostgreSQL"), /** 
                                * Powder-Proprietary License
                                */
    POWDER_PROPRIETARY("Powder-Proprietary"), /** 
                                               * Princeton License
                                               */
    PRINCETON("Princeton"), /** 
                             * Princeton-style License
                             */
    PRINCETONSTYLE("Princeton-style"), /** 
                                        * Proprietary! License
                                        */
    PROPRIETARY("Proprietary!"), /** 
                                  * Public-domain License
                                  */
    PUBLICDOMAIN("Public-domain"), /** 
                                    * Public-domain(C) License
                                    */
    PUBLICDOMAIN_C("Public-domain(C)"), /** 
                                         * Public-domain-ref License
                                         */
    PUBLICDOMAINREF("Public-domain-ref"), /** 
                                           * Public-Use License
                                           */
    PUBLIC_USE("Public-Use"), /** 
                               * Public-Use-1.0 License
                               */
    PUBLIC_USE10("Public-Use-1.0"), /** 
                                     * Python License
                                     */
    PYTHON("Python"), /** 
                       * Python-2.0 License
                       */
    PYTHON20("Python-2.0"), /** 
                             * Python-2.0.1 License
                             */
    PYTHON201("Python-2.0.1"), /** 
                                * Python-2.0.2 License
                                */
    PYTHON202("Python-2.0.2"), /** 
                                * Python-2.1.1 License
                                */
    PYTHON211("Python-2.1.1"), /** 
                                * Python-2.1.3 License
                                */
    PYTHON213("Python-2.1.3"), /** 
                                * Python-2.2 License
                                */
    PYTHON22("Python-2.2"), /** 
                             * Python-2.2.3 License
                             */
    PYTHON223("Python-2.2.3"), /** 
                                * Python-2.2.7 License
                                */
    PYTHON227("Python-2.2.7"), /** 
                                * Python-2.3 License
                                */
    PYTHON23("Python-2.3"), /** 
                             * Python-2.3.7 License
                             */
    PYTHON237("Python-2.3.7"), /** 
                                * Python-2.4.4 License
                                */
    PYTHON244("Python-2.4.4"), /** 
                                * Python-style License
                                */
    PYTHONSTYLE("Python-style"), /** 
                                  * Qmail License
                                  */
    QMAIL("Qmail"), /** 
                     * QPL License
                     */
    QPL("QPL"), /** 
                 * QPL-1.0 License
                 */
    QP_L10("QPL-1.0"), /** 
                        * QT(Commercial) License
                        */
    QT_COMMERCIAL("QT(Commercial)"), /** 
                                      * QuarterDeck License
                                      */
    QUARTER_DECK("QuarterDeck"), /** 
                                  * Quest-EULA License
                                  */
    QUEST_EULA("Quest-EULA"), /** 
                               * RCSL License
                               */
    RCSL("RCSL"), /** 
                   * RCSL-1.0 License
                   */
    RCS_L10("RCSL-1.0"), /** 
                          * RCSL-2.0 License
                          */
    RCS_L20("RCSL-2.0"), /** 
                          * RCSL-3.0 License
                          */
    RCS_L30("RCSL-3.0"), /** 
                          * RealNetworks-EULA License
                          */
    REAL_NETWORKS_EULA("RealNetworks-EULA"), /** 
                                              * RealNetworks-Unknown License
                                              */
    REAL_NETWORKS_UNKNOWN("RealNetworks-Unknown"), /** 
                                                    * RedHat-EULA License
                                                    */
    RED_HAT_EULA("RedHat-EULA"), /** 
                                  * Redland License
                                  */
    REDLAND("Redland"), /** 
                         * Restricted-rights License
                         */
    RESTRICTEDRIGHTS("Restricted-rights"), /** 
                                            * RHeCos-1.1 License
                                            */
    R_HE_COS11("RHeCos-1.1"), /** 
                               * Riverbank-EULA License
                               */
    RIVERBANK_EULA("Riverbank-EULA"), /** 
                                       * RPL-1.5 License
                                       */
    RP_L15("RPL-1.5"), /** 
                        * RPSL License
                        */
    RPSL("RPSL"), /** 
                   * RPSL-1.0 License
                   */
    RPS_L10("RPSL-1.0"), /** 
                          * RPSL-2.0 License
                          */
    RPS_L20("RPSL-2.0"), /** 
                          * RPSL-3.0 License
                          */
    RPS_L30("RPSL-3.0"), /** 
                          * RSCPL License
                          */
    RSCPL("RSCPL"), /** 
                     * Ruby License
                     */
    RUBY("Ruby"), /** 
                   * SAX-PD License
                   */
    SAXPD("SAX-PD"), /** 
                      * SciTech License
                      */
    SCI_TECH("SciTech"), /** 
                          * SCO(commercial) License
                          */
    SC_OCOMMERCIAL("SCO(commercial)"), /** 
                                        * SCSL License
                                        */
    SCSL("SCSL"), /** 
                   * SCSL-2.3 License
                   */
    SCS_L23("SCSL-2.3"), /** 
                          * SCSL-3.0 License
                          */
    SCS_L30("SCSL-3.0"), /** 
                          * SCSL-TSA License
                          */
    SCSLTSA("SCSL-TSA"), /** 
                          * SCSL-TSA-1.0 License
                          */
    SCSLTS_A10("SCSL-TSA-1.0"), /** 
                                 * See-doc(OTHER) License
                                 */
    SEEDOC_OTHER("See-doc(OTHER)"), /** 
                                     * See-file License
                                     */
    SEEFILE("See-file"), /** 
                          * See-file(COPYING) License
                          */
    SEEFILE_COPYING("See-file(COPYING)"), /** 
                                           * See-file(LICENSE) License
                                           */
    SEEFILE_LICENSE("See-file(LICENSE)"), /** 
                                           * See-file(README) License
                                           */
    SEEFILE_README("See-file(README)"), /** 
                                         * See-URL License
                                         */
    SEE_URL("See-URL"), /** 
                         * Sendmail License
                         */
    SENDMAIL("Sendmail"), /** 
                           * SGI License
                           */
    SGI("SGI"), /** 
                 * SGI-B-1.0 License
                 */
    SGI_B10("SGI-B-1.0"), /** 
                           * SGI-B-1.1 License
                           */
    SGI_B11("SGI-B-1.1"), /** 
                           * SGI-B-2.0 License
                           */
    SGI_B20("SGI-B-2.0"), /** 
                           * SGI-Freeware License
                           */
    SGI_FREEWARE("SGI-Freeware"), /** 
                                   * SGI_GLX License
                                   */
    SGI_GLX("SGI_GLX"), /** 
                         * SGI-Proprietary License
                         */
    SGI_PROPRIETARY("SGI-Proprietary"), /** 
                                         * SGI-style License
                                         */
    SG_ISTYLE("SGI-style"), /** 
                             * SGML License
                             */
    SGML("SGML"), /** 
                   * SimPL-2.0 License
                   */
    SIM_P_L20("SimPL-2.0"), /** 
                             * SISSL License
                             */
    SISSL("SISSL"), /** 
                     * SISSL-1.1 License
                     */
    SISS_L11("SISSL-1.1"), /** 
                            * SISSL-1.2 License
                            */
    SISS_L12("SISSL-1.2"), /** 
                            * Skype-EULA License
                            */
    SKYPE_EULA("Skype-EULA"), /** 
                               * Sleepycat(Non-commercial) License
                               */
    SLEEPYCAT_NONCOMMERCIAL("Sleepycat(Non-commercial)"), /** 
                                                           * SMLNJ License
                                                           */
    SMLNJ("SMLNJ"), /** 
                     * SNIA License
                     */
    SNIA("SNIA"), /** 
                   * SNIA-1.0 License
                   */
    SNI_A10("SNIA-1.0"), /** 
                          * SNIA-1.1 License
                          */
    SNI_A11("SNIA-1.1"), /** 
                          * SpikeSource License
                          */
    SPIKE_SOURCE("SpikeSource"), /** 
                                  * SPL License
                                  */
    SPL("SPL"), /** 
                 * SPL-1.0 License
                 */
    SP_L10("SPL-1.0"), /** 
                        * Stanford License
                        */
    STANFORD("Stanford"), /** 
                           * Stanford-style License
                           */
    STANFORDSTYLE("Stanford-style"), /** 
                                      * SugarCRM-1.1.3 License
                                      */
    SUGAR_CR_M113("SugarCRM-1.1.3"), /** 
                                      * Sun-BCLA-1.5.0 License
                                      */
    SUN_BCL_A150("Sun-BCLA-1.5.0"), /** 
                                     * Sun-EULA License
                                     */
    SUN_EULA("Sun-EULA"), /** 
                           * Sun-IP License
                           */
    SUN_IP("Sun-IP"), /** 
                       * Sun-Java License
                       */
    SUN_JAVA("Sun-Java"), /** 
                           * Sun(Non-commercial) License
                           */
    SUN_NONCOMMERCIAL("Sun(Non-commercial)"), /** 
                                               * SunPro License
                                               */
    SUN_PRO("SunPro"), /** 
                        * Sun(RESTRICTED) License
                        */
    SUN_RESTRICTED("Sun(RESTRICTED)"), /** 
                                        * Sun-RPC License
                                        */
    SUN_RPC("Sun-RPC"), /** 
                         * Sun-SCA License
                         */
    SUN_SCA("Sun-SCA"), /** 
                         * Sun(tm) License
                         */
    SUNTM("Sun(tm)"), /** 
                       * SW-Research License
                       */
    SW_RESEARCH("SW-Research"), /** 
                                 * Tapjoy License
                                 */
    TAPJOY("Tapjoy"), /** 
                       * Tektronix License
                       */
    TEKTRONIX("Tektronix"), /** 
                             * Tektronix-style License
                             */
    TEKTRONIXSTYLE("Tektronix-style"), /** 
                                        * Trademark-ref License
                                        */
    TRADEMARKREF("Trademark-ref"), /** 
                                    * Trident-EULA License
                                    */
    TRIDENT_EULA("Trident-EULA"), /** 
                                   * Trolltech License
                                   */
    TROLLTECH("Trolltech"), /** 
                             * U-BC License
                             */
    UBC("U-BC"), /** 
                  * U-Cambridge License
                  */
    U_CAMBRIDGE("U-Cambridge"), /** 
                                 * U-Cambridge-style License
                                 */
    U_CAMBRIDGESTYLE("U-Cambridge-style"), /** 
                                            * UCAR License
                                            */
    UCAR("UCAR"), /** 
                   * UCAR-style License
                   */
    UCA_RSTYLE("UCAR-style"), /** 
                               * U-Chicago License
                               */
    U_CHICAGO("U-Chicago"), /** 
                             * U-Columbia License
                             */
    U_COLUMBIA("U-Columbia"), /** 
                               * UCWare-EULA License
                               */
    UC_WARE_EULA("UCWare-EULA"), /** 
                                  * U-Del License
                                  */
    U_DEL("U-Del"), /** 
                     * U-Del-style License
                     */
    U_DELSTYLE("U-Del-style"), /** 
                                * U-Monash License
                                */
    U_MONASH("U-Monash"), /** 
                           * UnclassifiedLicense License
                           */
    UNCLASSIFIED_LICENSE("UnclassifiedLicense"), /** 
                                                  * Unidex License
                                                  */
    UNIDEX("Unidex"), /** 
                       * UnitedLinux-EULA License
                       */
    UNITED_LINUX_EULA("UnitedLinux-EULA"), /** 
                                            * Unlicense License
                                            */
    UNLICENSE("Unlicense"), /** 
                             * unRAR restriction License
                             */
    UN_RA_RRESTRICTION("unRAR restriction"), /** 
                                              * URA(gov't) License
                                              */
    UR_AGOVT("URA(gov't)"), /** 
                             * USC License
                             */
    USC("USC"), /** 
                 * USC(Non-commercial) License
                 */
    USC_NONCOMMERCIAL("USC(Non-commercial)"), /** 
                                               * USC-style License
                                               */
    US_CSTYLE("USC-style"), /** 
                             * US-Export-restrict License
                             */
    US_EXPORTRESTRICT("US-Export-restrict"), /** 
                                              * U-Utah License
                                              */
    U_UTAH("U-Utah"), /** 
                       * U-Wash(Free-Fork) License
                       */
    U_WASH_FREE_FORK("U-Wash(Free-Fork)"), /** 
                                            * VIM License
                                            */
    VIM("VIM"), /** 
                 * Vixie License
                 */
    VIXIE("Vixie"), /** 
                     * Vixie-license License
                     */
    VIXIELICENSE("Vixie-license"), /** 
                                    * VMware-EULA License
                                    */
    V_MWARE_EULA("VMware-EULA"), /** 
                                  * VSL-1.0 License
                                  */
    VS_L10("VSL-1.0"), /** 
                        * Wash-U-style License
                        */
    WASH_USTYLE("Wash-U-style"), /** 
                                  * Watcom License
                                  */
    WATCOM("Watcom"), /** 
                       * Watcom-1.0 License
                       */
    WATCOM10("Watcom-1.0"), /** 
                             * WebM License
                             */
    WEB_M("WebM"), /** 
                    * Wintertree License
                    */
    WINTERTREE("Wintertree"), /** 
                               * WordNet-3.0 License
                               */
    WORD_NET30("WordNet-3.0"), /** 
                                * WTFPL License
                                */
    WTFPL("WTFPL"), /** 
                     * WTI(Not-free) License
                     */
    WTI_NOTFREE("WTI(Not-free)"), /** 
                                   * WXwindows License
                                   */
    W_XWINDOWS("WXwindows"), /** 
                              * X11 License
                              */
    X11("X11"), /** 
                 * Xerox License
                 */
    XEROX("Xerox"), /** 
                     * Xerox-style License
                     */
    XEROXSTYLE("Xerox-style"), /** 
                                * XFree86 License
                                */
    X_FREE86("XFree86"), /** 
                          * XFree86-1.0 License
                          */
    X_FREE8610("XFree86-1.0"), /** 
                                * XFree86-1.1 License
                                */
    X_FREE8611("XFree86-1.1"), /** 
                                * Ximian License
                                */
    XIMIAN("Ximian"), /** 
                       * Ximian-1.0 License
                       */
    XIMIAN10("Ximian-1.0"), /** 
                             * XMLDB-1.0 License
                             */
    XMLD_B10("XMLDB-1.0"), /** 
                            * Xnet License
                            */
    XNET("Xnet"), /** 
                   * XOPEN-EULA License
                   */
    XOPENEULA("XOPEN-EULA"), /** 
                              * X/Open-style License
                              */
    X_OPENSTYLE("X/Open-style"), /** 
                                  * Yahoo-EULA License
                                  */
    YAHOO_EULA("Yahoo-EULA"), /** 
                               * YaST(SuSE) License
                               */
    YA_ST_SU_SE("YaST(SuSE)"), /** 
                                * YPL License
                                */
    YPL("YPL"), /** 
                 * YPL-1.0 License
                 */
    YP_L10("YPL-1.0"), /** 
                        * YPL-1.1 License
                        */
    YP_L11("YPL-1.1"), /** 
                        * Zend-2.0 License
                        */
    ZEND20("Zend-2.0"), /** 
                         * Zeus License
                         */
    ZEUS("Zeus"), /** 
                   * Zimbra License
                   */
    ZIMBRA("Zimbra"), /** 
                       * Zimbra-1.2 License
                       */
    ZIMBRA12("Zimbra-1.2"), /** 
                             * Zimbra-1.3 License
                             */
    ZIMBRA13("Zimbra-1.3"), /** 
                             * Zlib License
                             */
    ZLIB("Zlib"), /** 
                   * ZoneAlarm-EULA License
                   */
    ZONE_ALARM_EULA("ZoneAlarm-EULA"), /** 
                                        * ZPL-1.0 License
                                        */
    ZP_L10("ZPL-1.0"), /** 
                        * ZPL-1.1 License
                        */
    ZP_L11("ZPL-1.1"), /** 
                        * ZPL-2.0 License
                        */
    ZP_L20("ZPL-2.0"), /** 
                        * ZPL-2.1 License
                        */
    ZP_L21("ZPL-2.1"), /** 
                        * Zveno License
                        */
    ZVENO("Zveno");
    private final String value;

    private LicenseCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static LicenseCodeSimpleType convert(String value) {
        for (LicenseCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
