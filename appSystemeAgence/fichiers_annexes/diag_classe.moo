<?xml version="1.0" encoding="UTF-8"?>
<?PowerDesigner AppLocale="UTF16" ID="{0952261F-8205-4BFD-852E-D16443B9E6E8}" Label="" LastModificationDate="1465832161" Name="diag_classe" Objects="82" Symbols="28" Target="Java" TargetLink="Reference" Type="{18112060-1A4B-11D1-83D9-444553540000}" signature="CLD_OBJECT_MODEL" version="15.1.0.2850"?>
<!-- Veuillez ne pas modifier ce fichier -->

<Model xmlns:a="attribute" xmlns:c="collection" xmlns:o="object">

<o:RootObject Id="o1">
<c:Children>
<o:Model Id="o2">
<a:ObjectID>0952261F-8205-4BFD-852E-D16443B9E6E8</a:ObjectID>
<a:Name>diag_classe</a:Name>
<a:Code>diag_classe</a:Code>
<a:CreationDate>1465805720</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832150</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:PackageOptionsText>[FolderOptions]

[FolderOptions\Class Diagram Objects]
GenerationCheckModel=Yes
GenerationPath=
GenerationOptions=
GenerationTasks=
GenerationTargets=
GenerationSelections=</a:PackageOptionsText>
<a:ModelOptionsText>[ModelOptions]

[ModelOptions\Cld]
CaseSensitive=Yes
DisplayName=Yes
EnableTrans=Yes
EnableRequirements=No
ShowClss=No
DeftAttr=int
DeftMthd=int
DeftParm=int
DeftCont=java.util.Collection
DomnDttp=Yes
DomnChck=No
DomnRule=No
SupportDelay=No
PreviewEditable=Yes
AutoRealize=No
DttpFullName=Yes
DeftClssAttrVisi=private
VBNetPreprocessingSymbols=
CSharpPreprocessingSymbols=

[ModelOptions\Cld\NamingOptionsTemplates]

[ModelOptions\Cld\ClssNamingOptions]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG]

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPCKG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN]

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDDOMN\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS]

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDCLASS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF]

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDINTF\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR]

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDACTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS]

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDUCAS\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT]

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDOBJT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG]

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\SQDMSSG\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP]

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,FirstUpperChar)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CPDCOMP\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR]

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDATTR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD]

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDMETHOD\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM]

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDPARM\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT]

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPORT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART]

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMPART\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC]

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,,,firstLowerWord)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\CLDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC]

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\UCDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK]

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\GNRLLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK]

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RQLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK]

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\RLZSLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK]

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DEPDLINK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV]

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMACTV\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST]

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\ACDOBST\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT]

[ModelOptions\Cld\ClssNamingOptions\STAT\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\STAT\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE]

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDNODE\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI]

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDCMPI\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC]

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DPDASSC\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR]

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\OOMVAR\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO]

[ModelOptions\Cld\ClssNamingOptions\FILO\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=&quot;\/:*?&lt;&gt;|&quot;
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FILO\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_. &quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ]

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMEOBJ\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK]

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\FRMELNK\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass]

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Name]
Template=
MaxLen=254
Case=M
ValidChar=
InvldChar=
AllValid=Yes
NoAccent=No
DefaultChar=_
Script=.convert_name(%Name%,&quot;_&quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Cld\ClssNamingOptions\DefaultClass\Code]
Template=
MaxLen=254
Case=M
ValidChar=&#39;a&#39;-&#39;z&#39;,&#39;A&#39;-&#39;Z&#39;,&#39;0&#39;-&#39;9&#39;,&quot;_&quot;
InvldChar=&quot; &#39;(.)+=*/&quot;
AllValid=Yes
NoAccent=Yes
DefaultChar=_
Script=.convert_code(%Code%,&quot; &quot;)
ConvTable=
ConvTablePath=%_HOME%\Fichiers de ressources\Tables de conversion

[ModelOptions\Generate]

[ModelOptions\Generate\Cdm]
CheckModel=Yes
SaveLinks=Yes
NameToCode=No
Notation=2

[ModelOptions\Generate\Pdm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No
BuildTrgr=No
TablePrefix=
RefrUpdRule=RESTRICT
RefrDelRule=RESTRICT
IndxPKName=%TABLE%_PK
IndxAKName=%TABLE%_AK
IndxFKName=%REFR%_FK
IndxThreshold=
ColnFKName=%.3:PARENT%_%COLUMN%
ColnFKNameUse=No

[ModelOptions\Generate\Xsm]
CheckModel=Yes
SaveLinks=Yes
ORMapping=No
NameToCode=No</a:ModelOptionsText>
<c:ObjectLanguage>
<o:Shortcut Id="o3">
<a:ObjectID>DEA58D24-F15B-4F97-8263-03B267C42790</a:ObjectID>
<a:Name>Java</a:Name>
<a:Code>Java</a:Code>
<a:CreationDate>1465805720</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465805720</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>0DEDDB90-46E2-45A0-886E-411709DA0DC9</a:TargetID>
<a:TargetClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetClassID>
</o:Shortcut>
</c:ObjectLanguage>
<c:ExtendedModelDefinitions>
<o:Shortcut Id="o4">
<a:ObjectID>198F3D2A-3A5E-4B62-B743-D93361B553C3</a:ObjectID>
<a:Name>WSDL for Java</a:Name>
<a:Code>WSDLJava</a:Code>
<a:CreationDate>1465805720</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465805720</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:TargetStereotype/>
<a:TargetID>C8F5F7B2-CF9D-4E98-8301-959BB6E86C8A</a:TargetID>
<a:TargetClassID>186C8AC3-D3DC-11D3-881C-00508B03C75C</a:TargetClassID>
</o:Shortcut>
</c:ExtendedModelDefinitions>
<c:ClassDiagrams>
<o:ClassDiagram Id="o5">
<a:ObjectID>4E8181B8-0DB4-4FF9-B95C-21EAF3E0A01D</a:ObjectID>
<a:Name>DiagrammeClasses_1</a:Name>
<a:Code>DiagrammeClasses_1</a:Code>
<a:CreationDate>1465805720</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832150</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DisplayPreferences>[DisplayPreferences]

[DisplayPreferences\CLD]

[DisplayPreferences\General]
Adjust to text=Yes
Snap Grid=No
Constrain Labels=Yes
Display Grid=No
Show Page Delimiter=Yes
Grid size=0
Graphic unit=2
Window color=255, 255, 255
Background image=
Background mode=8
Watermark image=
Watermark mode=8
Show watermark on screen=No
Gradient mode=0
Gradient end color=255, 255, 255
Show Swimlane=No
SwimlaneVert=Yes
TreeVert=No
CompDark=0

[DisplayPreferences\Object]
Mode=0
Trunc Length=80
Word Length=80
Word Text=!&quot;&quot;#$%&amp;&#39;()*+,-./:;&lt;=&gt;?@[\]^_`{|}~
Shortcut IntIcon=Yes
Shortcut IntLoct=Yes
Shortcut IntFullPath=No
Shortcut IntLastPackage=Yes
Shortcut ExtIcon=Yes
Shortcut ExtLoct=No
Shortcut ExtFullPath=No
Shortcut ExtLastPackage=Yes
Shortcut ExtIncludeModl=Yes
EObjShowStrn=Yes
ExtendedObject.Comment=No
ExtendedObject.IconPicture=No
ExtendedObject_SymbolLayout=
ELnkShowStrn=Yes
ELnkShowName=Yes
ExtendedLink_SymbolLayout=
FileObject.Stereotype=No
FileObject.DisplayName=Yes
FileObject.LocationOrName=No
FileObject.IconPicture=No
FileObject.IconMode=Yes
FileObject_SymbolLayout=
PckgShowStrn=Yes
Package.Comment=No
Package.IconPicture=No
Package_SymbolLayout=
Display Model Version=Yes
Class.IconPicture=No
Class_SymbolLayout=
Interface.IconPicture=No
Interface_SymbolLayout=
Port.IconPicture=No
Port_SymbolLayout=
ClssShowSttr=Yes
Class.Comment=No
ClssShowCntr=Yes
ClssShowAttr=Yes
ClssAttrTrun=No
ClssAttrMax=3
ClssShowMthd=Yes
ClssMthdTrun=No
ClssMthdMax=3
ClssShowInnr=Yes
IntfShowSttr=Yes
Interface.Comment=No
IntfShowAttr=Yes
IntfAttrTrun=No
IntfAttrMax=3
IntfShowMthd=Yes
IntfMthdTrun=No
IntfMthdMax=3
IntfShowCntr=Yes
IntfShowInnr=Yes
PortShowName=Yes
PortShowType=No
PortShowMult=No
AttrShowVisi=Yes
AttrVisiFmt=1
AttrShowStrn=Yes
AttrShowDttp=Yes
AttrShowDomn=No
AttrShowInit=Yes
MthdShowVisi=Yes
MthdVisiFmt=1
MthdShowStrn=Yes
MthdShowRttp=Yes
MthdShowParm=Yes
AsscShowName=No
AsscShowCntr=Yes
AsscShowRole=Yes
AsscShowOrdr=Yes
AsscShowMult=Yes
AsscMultStr=Yes
AsscShowStrn=No
GnrlShowName=No
GnrlShowStrn=Yes
GnrlShowCntr=Yes
RlzsShowName=No
RlzsShowStrn=Yes
RlzsShowCntr=Yes
DepdShowName=No
DepdShowStrn=Yes
DepdShowCntr=Yes
RqlkShowName=No
RqlkShowStrn=Yes
RqlkShowCntr=Yes

[DisplayPreferences\Symbol]

[DisplayPreferences\Symbol\FRMEOBJ]
STRNFont=Arial,8,N
STRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LABLFont=Arial,8,N
LABLFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=6000
Height=2000
Brush color=255 255 255
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=64
Brush gradient color=192 192 192
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 255 128 128
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FRMELNK]
CENTERFont=Arial,8,N
CENTERFont color=0, 0, 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 128 255
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\FILO]
OBJSTRNFont=Arial,8,N
OBJSTRNFont color=0, 0, 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0, 0, 0
LCNMFont=Arial,8,N
LCNMFont color=0, 0, 0
AutoAdjustToText=Yes
Keep aspect=Yes
Keep center=Yes
Keep size=No
Width=2400
Height=2400
Brush color=255 255 255
Fill Color=No
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 0 0 255
Shadow color=192 192 192
Shadow=-1

[DisplayPreferences\Symbol\CLDPCKG]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=255 255 192
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 178 178 178
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDCLASS]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
CNTRFont=Arial,8,N
CNTRFont color=0 0 0
AttributesFont=Arial,8,N
AttributesFont color=0 0 0
ClassPrimaryAttributeFont=Arial,8,U
ClassPrimaryAttributeFont color=0 0 0
OperationsFont=Arial,8,N
OperationsFont color=0 0 0
InnerClassifiersFont=Arial,8,N
InnerClassifiersFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=233 202 131
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 0 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDINTF]
STRNFont=Arial,8,N
STRNFont color=0 0 0
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
CNTRFont=Arial,8,N
CNTRFont color=0 0 0
AttributesFont=Arial,8,N
AttributesFont color=0 0 0
OperationsFont=Arial,8,N
OperationsFont color=0 0 0
InnerClassifiersFont=Arial,8,N
InnerClassifiersFont color=0 0 0
LABLFont=Arial,8,N
LABLFont color=0 0 0
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Width=4800
Height=3600
Brush color=205 156 156
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 0 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\OOMPORT]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
AutoAdjustToText=No
Keep aspect=No
Keep center=No
Keep size=No
Width=825
Height=800
Brush color=250 241 211
Fill Color=Yes
Brush style=6
Brush bitmap mode=12
Brush gradient mode=65
Brush gradient color=255 255 255
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 64 0
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDASSC]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
MULAFont=Arial,8,N
MULAFont color=0 0 0
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\INNERLINK]
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\CLDACLK]
Line style=2
Pen=2 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\GNRLLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\RLZSLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=3 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\RQLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=1 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\DEPDLINK]
DISPNAMEFont=Arial,8,N
DISPNAMEFont color=0 0 0
Line style=2
Pen=2 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\USRDEPD]
OBJXSTRFont=Arial,8,N
OBJXSTRFont color=0 0 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=2 0 128 0 64
Shadow color=192 192 192
Shadow=0

[DisplayPreferences\Symbol\Free Symbol]
Free TextFont=Arial,8,N
Free TextFont color=0 0 0
Line style=2
AutoAdjustToText=Yes
Keep aspect=No
Keep center=No
Keep size=No
Brush color=255 255 255
Fill Color=Yes
Brush style=1
Brush bitmap mode=12
Brush gradient mode=0
Brush gradient color=118 118 118
Brush background image=
Custom shape=
Custom text mode=0
Pen=1 0 128 64 0
Shadow color=192 192 192
Shadow=0</a:DisplayPreferences>
<a:PaperSize>(8268, 11693)</a:PaperSize>
<a:PageMargins>((315,354), (433,354))</a:PageMargins>
<a:PageOrientation>1</a:PageOrientation>
<a:PaperSource>15</a:PaperSource>
<c:Symbols>
<o:GeneralizationSymbol Id="o6">
<a:CreationDate>1465807798</a:CreationDate>
<a:ModificationDate>1465821870</a:ModificationDate>
<a:Rect>((-3119,-658), (-2108,18239))</a:Rect>
<a:ListOfPoints>((-3119,-658),(-3119,9763),(-2108,9763),(-2108,18239))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>7</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o7"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Generalization Ref="o9"/>
</c:Object>
</o:GeneralizationSymbol>
<o:GeneralizationSymbol Id="o10">
<a:CreationDate>1465807799</a:CreationDate>
<a:ModificationDate>1465821871</a:ModificationDate>
<a:Rect>((-17222,2572), (-6383,18239))</a:Rect>
<a:ListOfPoints>((-17222,2572),(-17222,10756),(-6383,10756),(-6383,18239))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>7</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o11"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Generalization Ref="o12"/>
</c:Object>
</o:GeneralizationSymbol>
<o:GeneralizationSymbol Id="o13">
<a:CreationDate>1465808205</a:CreationDate>
<a:ModificationDate>1465826137</a:ModificationDate>
<a:Rect>((48221,-704), (51851,20162))</a:Rect>
<a:ListOfPoints>((51815,-704),(51851,9902),(48221,9902),(48221,20162))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>7</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o14"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o15"/>
</c:DestinationSymbol>
<c:Object>
<o:Generalization Ref="o16"/>
</c:Object>
</o:GeneralizationSymbol>
<o:GeneralizationSymbol Id="o17">
<a:CreationDate>1465808205</a:CreationDate>
<a:ModificationDate>1465822303</a:ModificationDate>
<a:Rect>((32693,19896), (50763,21523))</a:Rect>
<a:ListOfPoints>((32693,19896),(32693,21523),(50763,21523))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>7</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o18"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o15"/>
</c:DestinationSymbol>
<c:Object>
<o:Generalization Ref="o19"/>
</c:Object>
</o:GeneralizationSymbol>
<o:GeneralizationSymbol Id="o20">
<a:CreationDate>1465808206</a:CreationDate>
<a:ModificationDate>1465822303</a:ModificationDate>
<a:Rect>((19270,88), (44433,24410))</a:Rect>
<a:ListOfPoints>((19270,88),(44433,88),(44433,24410))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>7</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o21"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o15"/>
</c:DestinationSymbol>
<c:Object>
<o:Generalization Ref="o22"/>
</c:Object>
</o:GeneralizationSymbol>
<o:AssociationSymbol Id="o23">
<a:CreationDate>1465808784</a:CreationDate>
<a:ModificationDate>1465821876</a:ModificationDate>
<a:Rect>((1044,24498), (41876,35382))</a:Rect>
<a:ListOfPoints>((41876,35382),(6577,35382),(6577,24498),(1044,24498))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o24"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o25"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o26">
<a:CreationDate>1465808786</a:CreationDate>
<a:ModificationDate>1465822303</a:ModificationDate>
<a:Rect>((42445,26711), (46419,35815))</a:Rect>
<a:ListOfPoints>((44432,35815),(44432,26711))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o24"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o15"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o27"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o28">
<a:CreationDate>1465808848</a:CreationDate>
<a:ModificationDate>1465821869</a:ModificationDate>
<a:Rect>((2010,-3931), (8211,17826))</a:Rect>
<a:ListOfPoints>((8174,-3931),(8174,10791),(2047,10791),(2047,17826))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o21"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o29"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o30">
<a:CreationDate>1465809157</a:CreationDate>
<a:ModificationDate>1465826035</a:ModificationDate>
<a:Rect>((-16174,25008), (-8835,34751))</a:Rect>
<a:ListOfPoints>((-16174,34751),(-16174,26182),(-8835,26182))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o31"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o32"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o33">
<a:CreationDate>1465809552</a:CreationDate>
<a:ModificationDate>1465826035</a:ModificationDate>
<a:Rect>((-10820,19127), (30967,36853))</a:Rect>
<a:ListOfPoints>((30967,19127),(30967,35679),(-10820,35679))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o18"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o31"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o34"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o35">
<a:CreationDate>1465822026</a:CreationDate>
<a:ModificationDate>1465822118</a:ModificationDate>
<a:Rect>((2808,18621), (27862,20969))</a:Rect>
<a:ListOfPoints>((27862,19795),(2808,19795))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o18"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o8"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o36"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationClassLinkSymbol Id="o37">
<a:CreationDate>1465822110</a:CreationDate>
<a:ModificationDate>1465822247</a:ModificationDate>
<a:Rect>((15335,19795), (16836,28364))</a:Rect>
<a:ListOfPoints>((15335,19795),(16836,19795),(16836,28364))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>0</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<c:SourceSymbol>
<o:AssociationSymbol Ref="o35"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o38"/>
</c:DestinationSymbol>
<c:Object>
<o:AssociationClassLink Ref="o39"/>
</c:Object>
</o:AssociationClassLinkSymbol>
<o:AssociationSymbol Id="o40">
<a:CreationDate>1465822135</a:CreationDate>
<a:ModificationDate>1465822135</a:ModificationDate>
<a:Rect>((2994,16132), (27955,18480))</a:Rect>
<a:ListOfPoints>((2994,17306),(27955,17306))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o8"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o18"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o41"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationClassLinkSymbol Id="o42">
<a:CreationDate>1465822173</a:CreationDate>
<a:ModificationDate>1465822250</a:ModificationDate>
<a:Rect>((15474,8561), (17270,17306))</a:Rect>
<a:ListOfPoints>((15474,17306),(17270,17306),(17270,8561))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>0</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:DashStyle>2</a:DashStyle>
<a:ShadowColor>12632256</a:ShadowColor>
<c:SourceSymbol>
<o:AssociationSymbol Ref="o40"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o43"/>
</c:DestinationSymbol>
<c:Object>
<o:AssociationClassLink Ref="o44"/>
</c:Object>
</o:AssociationClassLinkSymbol>
<o:AssociationSymbol Id="o45">
<a:CreationDate>1465826127</a:CreationDate>
<a:ModificationDate>1465826137</a:ModificationDate>
<a:Rect>((34899,1690), (48671,16982))</a:Rect>
<a:ListOfPoints>((48671,2864),(34899,2864),(34899,16982))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o14"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o18"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o46"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o47">
<a:CreationDate>1465832121</a:CreationDate>
<a:ModificationDate>1465832121</a:ModificationDate>
<a:Rect>((22337,-3061), (49112,5162))</a:Rect>
<a:ListOfPoints>((49112,-1888),(22337,-1888),(22337,5162))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o14"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o43"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o48"/>
</c:Object>
</o:AssociationSymbol>
<o:AssociationSymbol Id="o49">
<a:CreationDate>1465832150</a:CreationDate>
<a:ModificationDate>1465832150</a:ModificationDate>
<a:Rect>((23477,4007), (56289,32256))</a:Rect>
<a:ListOfPoints>((56252,4007),(56252,31082),(23477,31082))</a:ListOfPoints>
<a:CornerStyle>2</a:CornerStyle>
<a:ArrowStyle>8</a:ArrowStyle>
<a:LineColor>4194432</a:LineColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>DISPNAME 0 Arial,8,N
MULA 0 Arial,8,N</a:FontList>
<c:SourceSymbol>
<o:ClassSymbol Ref="o14"/>
</c:SourceSymbol>
<c:DestinationSymbol>
<o:ClassSymbol Ref="o38"/>
</c:DestinationSymbol>
<c:Object>
<o:Association Ref="o50"/>
</c:Object>
</o:AssociationSymbol>
<o:ClassSymbol Id="o8">
<a:CreationDate>1465805728</a:CreationDate>
<a:ModificationDate>1465809646</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-10277,14729), (3213,28439))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o51"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o11">
<a:CreationDate>1465807459</a:CreationDate>
<a:ModificationDate>1465821871</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-26691,-2111), (-14051,5605))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o52"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o7">
<a:CreationDate>1465807615</a:CreationDate>
<a:ModificationDate>1465821870</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-7319,-3526), (1383,1268))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o53"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o15">
<a:CreationDate>1465807827</a:CreationDate>
<a:ModificationDate>1465822303</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((42670,19644), (50908,28484))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o54"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o21">
<a:CreationDate>1465807955</a:CreationDate>
<a:ModificationDate>1465821869</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((7693,-4651), (19561,143))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o55"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o18">
<a:CreationDate>1465808065</a:CreationDate>
<a:ModificationDate>1465821991</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((27246,15844), (40350,20638))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o56"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o14">
<a:CreationDate>1465808173</a:CreationDate>
<a:ModificationDate>1465826137</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((47840,-2529), (57622,4213))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o57"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o38">
<a:CreationDate>1465808422</a:CreationDate>
<a:ModificationDate>1465822247</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((10077,24754), (24031,32470))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o58"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o24">
<a:CreationDate>1465808680</a:CreationDate>
<a:ModificationDate>1465821876</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((40379,33332), (49311,39100))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o59"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o31">
<a:CreationDate>1465809014</a:CreationDate>
<a:ModificationDate>1465826035</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((-19847,31802), (-9215,39518))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o60"/>
</c:Object>
</o:ClassSymbol>
<o:ClassSymbol Id="o43">
<a:CreationDate>1465816290</a:CreationDate>
<a:ModificationDate>1465822250</a:ModificationDate>
<a:IconMode>-1</a:IconMode>
<a:Rect>((10293,4703), (24247,12419))</a:Rect>
<a:LineColor>128</a:LineColor>
<a:FillColor>8637161</a:FillColor>
<a:ShadowColor>12632256</a:ShadowColor>
<a:FontList>STRN 0 Arial,8,N
DISPNAME 0 Arial,8,N
CNTR 0 Arial,8,N
Attributes 0 Arial,8,N
ClassPrimaryAttribute 0 Arial,8,U
Operations 0 Arial,8,N
InnerClassifiers 0 Arial,8,N
LABL 0 Arial,8,N</a:FontList>
<a:BrushStyle>6</a:BrushStyle>
<a:GradientFillMode>65</a:GradientFillMode>
<a:GradientEndColor>16777215</a:GradientEndColor>
<c:Object>
<o:Class Ref="o61"/>
</c:Object>
</o:ClassSymbol>
</c:Symbols>
</o:ClassDiagram>
</c:ClassDiagrams>
<c:DefaultDiagram>
<o:ClassDiagram Ref="o5"/>
</c:DefaultDiagram>
<c:Classes>
<o:Class Id="o51">
<a:ObjectID>50FF454C-8AA3-4DBF-9A90-A0051EEF9918</a:ObjectID>
<a:Name>BienImmobilier</a:Name>
<a:Code>BienImmobilier</a:Code>
<a:CreationDate>1465805728</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465823968</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<a:Classifier.Abstract>1</a:Classifier.Abstract>
<c:Attributes>
<o:Attribute Id="o62">
<a:ObjectID>7E95ED2F-DB8E-426E-B9CC-AFA7D0F14145</a:ObjectID>
<a:Name>id</a:Name>
<a:Code>id</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807446</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o63">
<a:ObjectID>B6352D33-208F-451F-995F-70F3CEA6ED0F</a:ObjectID>
<a:Name>codeStandard</a:Name>
<a:Code>codeStandard</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808272</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o64">
<a:ObjectID>074077F7-7ABB-4C89-8E32-D2980EF786D0</a:ObjectID>
<a:Name>statut</a:Name>
<a:Code>statut</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807446</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o65">
<a:ObjectID>C2CC5B4B-8B77-499F-A5FF-04C95BAE7857</a:ObjectID>
<a:Name>dateEntree</a:Name>
<a:Code>dateEntree</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807446</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>java.util.Date</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o66">
<a:ObjectID>BC146B0B-9516-451C-A430-3E0707C1D20D</a:ObjectID>
<a:Name>adresse</a:Name>
<a:Code>adresse</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808751</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Adresse</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o59"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o67">
<a:ObjectID>51832175-7574-4E42-99A0-62BA2C2A6729</a:ObjectID>
<a:Name>dateDisponible</a:Name>
<a:Code>dateDisponible</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807446</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o68">
<a:ObjectID>475E8DF8-E88A-4F54-BFE7-5990E359C1B4</a:ObjectID>
<a:Name>revenuCadastral</a:Name>
<a:Code>revenuCadastral</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807446</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o69">
<a:ObjectID>513E0725-3D65-4A91-A19C-7B3CA65B57B5</a:ObjectID>
<a:Name>listeVisites</a:Name>
<a:Code>listeVisites</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808555</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Visite</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o58"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o70">
<a:ObjectID>DB79555D-89EF-4DB5-96C3-E4AD3F1F57EE</a:ObjectID>
<a:Name>clientAcquereur</a:Name>
<a:Code>clientAcquereur</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465812141</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Client</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o56"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o71">
<a:ObjectID>969CC5CC-AAFF-4C90-BCDB-CD09C7AA7B58</a:ObjectID>
<a:Name>numContrat</a:Name>
<a:Code>numContrat</a:Code>
<a:CreationDate>1465806573</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807446</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o52">
<a:ObjectID>C3BEEF7E-87D8-49ED-A854-33DD34BF4CAD</a:ObjectID>
<a:Name>BienALouer</a:Name>
<a:Code>BienALouer</a:Code>
<a:CreationDate>1465807459</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807596</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o72">
<a:ObjectID>44C0D461-8092-4E7C-BAE5-FE6F25779A6A</a:ObjectID>
<a:Name>caution</a:Name>
<a:Code>caution</a:Code>
<a:CreationDate>1465807461</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807596</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o73">
<a:ObjectID>6B49B0EB-F116-48FA-AF07-6831BEE4DCBF</a:ObjectID>
<a:Name>loyerMensuel</a:Name>
<a:Code>loyerMensuel</a:Code>
<a:CreationDate>1465807461</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807596</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o74">
<a:ObjectID>24BB180B-B456-4080-A977-6D40E13C2B0A</a:ObjectID>
<a:Name>chargesMensuelles</a:Name>
<a:Code>chargesMensuelles</a:Code>
<a:CreationDate>1465807461</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807596</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o75">
<a:ObjectID>CFBE9294-07AA-4D97-B3A3-3FA32CC278C9</a:ObjectID>
<a:Name>typeBail</a:Name>
<a:Code>typeBail</a:Code>
<a:CreationDate>1465807461</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807596</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o76">
<a:ObjectID>E09E0FA5-3E87-4CEF-B10D-2FC2203AD064</a:ObjectID>
<a:Name>garniture</a:Name>
<a:Code>garniture</a:Code>
<a:CreationDate>1465807461</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807596</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>boolean</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o53">
<a:ObjectID>32E2C583-1589-43D7-A2CD-F223A3C7FF27</a:ObjectID>
<a:Name>BienAAcheter</a:Name>
<a:Code>BienAAcheter</a:Code>
<a:CreationDate>1465807615</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465811918</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o77">
<a:ObjectID>53C17990-29F1-45C8-80DF-BC6326C662AB</a:ObjectID>
<a:Name>prixAchat</a:Name>
<a:Code>prixAchat</a:Code>
<a:CreationDate>1465807616</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807715</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o78">
<a:ObjectID>897570CE-3473-4F8D-80BF-19D02F4CC2D1</a:ObjectID>
<a:Name>etat</a:Name>
<a:Code>etat</a:Code>
<a:CreationDate>1465811906</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465811918</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o54">
<a:ObjectID>31AE011D-ED45-416F-AB96-EB4E0D51B9A8</a:ObjectID>
<a:Name>Personne</a:Name>
<a:Code>Personne</a:Code>
<a:CreationDate>1465807827</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465811957</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<a:Classifier.Abstract>1</a:Classifier.Abstract>
<c:Attributes>
<o:Attribute Id="o79">
<a:ObjectID>82E0261A-85E8-473B-AAB5-BA0FEC85D9DC</a:ObjectID>
<a:Name>nom</a:Name>
<a:Code>nom</a:Code>
<a:CreationDate>1465807829</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807941</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o80">
<a:ObjectID>BECCBAE6-D783-418E-9E15-4B75F25C1561</a:ObjectID>
<a:Name>prenom</a:Name>
<a:Code>prenom</a:Code>
<a:CreationDate>1465807829</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807941</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o81">
<a:ObjectID>FB720E57-509D-4B45-A437-0F7B82371BF3</a:ObjectID>
<a:Name>adresse</a:Name>
<a:Code>adresse</a:Code>
<a:CreationDate>1465807829</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808771</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Adresse</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o59"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o82">
<a:ObjectID>12A324D4-B92B-4440-A046-4B24B44626C2</a:ObjectID>
<a:Name>telPrive</a:Name>
<a:Code>telPrive</a:Code>
<a:CreationDate>1465807829</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807941</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o83">
<a:ObjectID>DADA9D42-34D7-4E90-A1D0-F763CBFCD72A</a:ObjectID>
<a:Name>id</a:Name>
<a:Code>id</a:Code>
<a:CreationDate>1465811943</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465811957</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o55">
<a:ObjectID>E1181918-CAC3-4652-ADC5-367A0A6C43DA</a:ObjectID>
<a:Name>Proprietaire</a:Name>
<a:Code>Proprietaire</a:Code>
<a:CreationDate>1465807955</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808885</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o84">
<a:ObjectID>5360E62E-12DE-4D1F-B882-B427152F198F</a:ObjectID>
<a:Name>telTravail</a:Name>
<a:Code>telTravail</a:Code>
<a:CreationDate>1465807956</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808057</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o85">
<a:ObjectID>55B3F444-0C54-46DF-8D5C-E8A207492A41</a:ObjectID>
<a:Name>listeBiens</a:Name>
<a:Code>listeBiens</a:Code>
<a:CreationDate>1465807956</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808057</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>BienImmobilier</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o51"/>
</c:ObjectDataType>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o56">
<a:ObjectID>D908E68B-5AEF-436D-8CA4-FA3BFD99A4D7</a:ObjectID>
<a:Name>Client</a:Name>
<a:Code>Client</a:Code>
<a:CreationDate>1465808065</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465827454</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o86">
<a:ObjectID>2C79870F-F1A8-4CD6-97F0-20501549FD15</a:ObjectID>
<a:Name>listeCodesStandards</a:Name>
<a:Code>listeCodesStandards</a:Code>
<a:CreationDate>1465808066</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808164</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o87">
<a:ObjectID>DEB0AC7E-3836-426D-B006-ED8BACB455DC</a:ObjectID>
<a:Name>acquereur</a:Name>
<a:Code>acquereur</a:Code>
<a:CreationDate>1465812448</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465812521</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>boolean</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o57">
<a:ObjectID>B99A1748-E846-4E47-8ACB-9A7D14114B16</a:ObjectID>
<a:Name>Conseiller</a:Name>
<a:Code>Conseiller</a:Code>
<a:CreationDate>1465808173</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832161</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o88">
<a:ObjectID>F9005DD1-84A3-4570-8EE9-FF79C70F08FA</a:ObjectID>
<a:Name>login</a:Name>
<a:Code>login</a:Code>
<a:CreationDate>1465812247</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465812267</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o89">
<a:ObjectID>D8CA8A10-1918-4B8F-AA61-075C6028D529</a:ObjectID>
<a:Name>motDePasse</a:Name>
<a:Code>motDePasse</a:Code>
<a:CreationDate>1465812247</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465812267</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o90">
<a:ObjectID>4400F7F1-368D-47F3-8EDD-33ABEBBA63D0</a:ObjectID>
<a:Name>listeClients</a:Name>
<a:Code>listeClients</a:Code>
<a:CreationDate>1465827357</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465827454</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Client</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o56"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o91">
<a:ObjectID>30ACA7E1-259B-4A80-A4A7-D72A1E237EC0</a:ObjectID>
<a:Name>CA</a:Name>
<a:Code>ca</a:Code>
<a:CreationDate>1465832027</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832040</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o58">
<a:ObjectID>5E1678EB-53DD-4DEE-AC5E-CE4BAD3776FD</a:ObjectID>
<a:Name>Visite</a:Name>
<a:Code>Visite</a:Code>
<a:CreationDate>1465808422</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832161</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o92">
<a:ObjectID>E56BEBD5-ECB8-4C49-B45F-883D0FFC18CF</a:ObjectID>
<a:Name>listeClients</a:Name>
<a:Code>listeClients</a:Code>
<a:CreationDate>1465808424</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465823755</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Client</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o56"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o93">
<a:ObjectID>D4B64164-CF8F-4D1D-87BA-D577BE533CFE</a:ObjectID>
<a:Name>date</a:Name>
<a:Code>date</a:Code>
<a:CreationDate>1465808424</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808471</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>java.util.Date</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o94">
<a:ObjectID>659720B8-12AB-4EAD-88DD-F5F575E2AA45</a:ObjectID>
<a:Name>responsable</a:Name>
<a:Code>responsable</a:Code>
<a:CreationDate>1465808424</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808471</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Conseiller</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o57"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o95">
<a:ObjectID>5C471455-53CB-44BD-8ED7-3FD58B5A58BA</a:ObjectID>
<a:Name>bienImmobilier</a:Name>
<a:Code>bienImmobilier</a:Code>
<a:CreationDate>1465823796</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465823884</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>BienImmobilier</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o51"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o96">
<a:ObjectID>B0FCF504-DEB2-4B61-9BB9-0062A7799FC9</a:ObjectID>
<a:Name>heure</a:Name>
<a:Code>heure</a:Code>
<a:CreationDate>1465827474</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465827523</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o59">
<a:ObjectID>E06C596D-BC8C-4842-9D0A-2E1D5BF9F564</a:ObjectID>
<a:Name>Adresse</a:Name>
<a:Code>Adresse</a:Code>
<a:CreationDate>1465808680</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808815</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o97">
<a:ObjectID>1368F690-6CDA-49B1-B049-C5BDEE4F37E6</a:ObjectID>
<a:Name>rue</a:Name>
<a:Code>rue</a:Code>
<a:CreationDate>1465808681</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808718</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o98">
<a:ObjectID>A199D4E4-88B5-4B6B-A105-ED2FAA0756FD</a:ObjectID>
<a:Name>codePostal</a:Name>
<a:Code>codePostal</a:Code>
<a:CreationDate>1465808681</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808718</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o99">
<a:ObjectID>D0C8822F-0CC1-4D4A-82E8-3A6F7FF8CE88</a:ObjectID>
<a:Name>ville</a:Name>
<a:Code>ville</a:Code>
<a:CreationDate>1465808681</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808718</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o60">
<a:ObjectID>79FF4F58-7CCC-4EF5-BBC6-19336F053308</a:ObjectID>
<a:Name>ClasseStandard</a:Name>
<a:Code>ClasseStandard</a:Code>
<a:CreationDate>1465809014</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465815291</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o100">
<a:ObjectID>B143C1CD-8F10-4380-B991-CC75EAE4A165</a:ObjectID>
<a:Name>code</a:Name>
<a:Code>code</a:Code>
<a:CreationDate>1465809180</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465809453</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o101">
<a:ObjectID>3DEFD7E4-0B29-47E9-A059-BB2171EE4C1C</a:ObjectID>
<a:Name>typeBien</a:Name>
<a:Code>typeBien</a:Code>
<a:CreationDate>1465809180</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465824816</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>String</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o102">
<a:ObjectID>D48A6D1A-527F-4520-B5D1-1D59E4E37F15</a:ObjectID>
<a:Name>prixMax</a:Name>
<a:Code>prixMax</a:Code>
<a:CreationDate>1465809180</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465809453</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o103">
<a:ObjectID>34E5F539-8641-4D4F-AEEE-F94AE55FF635</a:ObjectID>
<a:Name>superficieMin</a:Name>
<a:Code>superficieMin</a:Code>
<a:CreationDate>1465809180</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465809453</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o104">
<a:ObjectID>3057E300-086B-473B-A2E8-F586A8EBB790</a:ObjectID>
<a:Name>modeOffre</a:Name>
<a:Code>modeOffre</a:Code>
<a:CreationDate>1465811821</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465811904</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>boolean</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
<o:Class Id="o61">
<a:ObjectID>E50A9B67-99ED-4396-BD32-FD3AFF952098</a:ObjectID>
<a:Name>Contrat</a:Name>
<a:Code>Contrat</a:Code>
<a:CreationDate>1465816290</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832135</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:UseParentNamespace>0</a:UseParentNamespace>
<c:Attributes>
<o:Attribute Id="o105">
<a:ObjectID>A72DFE6D-6978-44E1-A2CE-12B17F54F1DD</a:ObjectID>
<a:Name>numContrat</a:Name>
<a:Code>numContrat</a:Code>
<a:CreationDate>1465816423</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465816591</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>int</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o106">
<a:ObjectID>92D840B7-BB84-4881-9214-36937599EC5B</a:ObjectID>
<a:Name>bienImmobilier</a:Name>
<a:Code>bienImmobilier</a:Code>
<a:CreationDate>1465816423</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465816591</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>BienImmobilier</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o51"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o107">
<a:ObjectID>9C958285-AC5A-44FA-8DE0-96AD7CA1D34E</a:ObjectID>
<a:Name>client</a:Name>
<a:Code>client</a:Code>
<a:CreationDate>1465816423</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465816591</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>Client</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
<c:ObjectDataType>
<o:Class Ref="o56"/>
</c:ObjectDataType>
</o:Attribute>
<o:Attribute Id="o108">
<a:ObjectID>A7A549B3-6AE8-4E35-A956-23490927F73A</a:ObjectID>
<a:Name>dateAchat</a:Name>
<a:Code>dateAchat</a:Code>
<a:CreationDate>1465823320</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465823364</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>java.util.Date</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
<o:Attribute Id="o109">
<a:ObjectID>79596626-BE55-4E54-A4CE-063DF201C9BE</a:ObjectID>
<a:Name>prixAchat</a:Name>
<a:Code>prixAchat</a:Code>
<a:CreationDate>1465823402</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465823425</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:DataType>double</a:DataType>
<a:Attribute.Visibility>-</a:Attribute.Visibility>
</o:Attribute>
</c:Attributes>
</o:Class>
</c:Classes>
<c:Associations>
<o:Association Id="o25">
<a:ObjectID>624F8202-83F2-4899-9494-B49F9BB11DB8</a:ObjectID>
<a:Name>Association_2</a:Name>
<a:Code>association2</a:Code>
<a:CreationDate>1465808784</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808802</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>1..1</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,276={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,6=&lt;None&gt;
{78C31404-0EE5-4FD0-9038-EE396B305F05},roleBContainer,6=&lt;None&gt;

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o51"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o59"/>
</c:Object2>
</o:Association>
<o:Association Id="o27">
<a:ObjectID>12A4D156-3D8D-461C-9AFB-05DAD4EE7884</a:ObjectID>
<a:Name>Association_3</a:Name>
<a:Code>association3</a:Code>
<a:CreationDate>1465808786</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808815</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>1..1</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,276={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,6=&lt;None&gt;
{78C31404-0EE5-4FD0-9038-EE396B305F05},roleBContainer,6=&lt;None&gt;

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o54"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o59"/>
</c:Object2>
</o:Association>
<o:Association Id="o29">
<a:ObjectID>FF655E40-4B74-4B94-8659-9EE8CB68CBC8</a:ObjectID>
<a:Name>Association_4</a:Name>
<a:Code>association4</a:Code>
<a:CreationDate>1465808848</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808885</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>1..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,224={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,17=java.util.HashSet

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o51"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o55"/>
</c:Object2>
</o:Association>
<o:Association Id="o32">
<a:ObjectID>A6DD83BD-8E6E-403C-8A69-42A1F0672F52</a:ObjectID>
<a:Name>Association_5</a:Name>
<a:Code>association5</a:Code>
<a:CreationDate>1465809157</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465809536</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,224={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,17=java.util.HashSet

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o51"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o60"/>
</c:Object2>
</o:Association>
<o:Association Id="o34">
<a:ObjectID>F05D18A7-8E4B-450E-B04E-5F7D3FADB9F5</a:ObjectID>
<a:Name>Association_6</a:Name>
<a:Code>association6</a:Code>
<a:CreationDate>1465809552</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465809580</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>0..*</a:RoleAMultiplicity>
<a:RoleBMultiplicity>1..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,224={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,17=java.util.HashSet

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o60"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o56"/>
</c:Object2>
</o:Association>
<o:Association Id="o36">
<a:ObjectID>F8E80DE6-6BE1-41D0-B604-CC0827F99D1D</a:ObjectID>
<a:Name>Association_8</a:Name>
<a:Code>association8</a:Code>
<a:CreationDate>1465822026</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465831802</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>0..*</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,224={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,17=java.util.HashSet

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o51"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o56"/>
</c:Object2>
</o:Association>
<o:Association Id="o41">
<a:ObjectID>F0BF1A64-61C8-43E6-8398-00C2010704B3</a:ObjectID>
<a:Name>Association_7</a:Name>
<a:Code>association7</a:Code>
<a:CreationDate>1465822135</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465831802</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>0..*</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,276={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,6=&lt;None&gt;
{78C31404-0EE5-4FD0-9038-EE396B305F05},roleBContainer,6=&lt;None&gt;

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o56"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o51"/>
</c:Object2>
</o:Association>
<o:Association Id="o46">
<a:ObjectID>F0E993F4-4A1F-418E-ADD0-3E4E1CAC1372</a:ObjectID>
<a:Name>Association_9</a:Name>
<a:Code>association9</a:Code>
<a:CreationDate>1465826127</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465826153</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,224={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,17=java.util.HashSet

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o56"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o57"/>
</c:Object2>
</o:Association>
<o:Association Id="o48">
<a:ObjectID>F37FE525-45E6-409E-842F-0F81A30290C6</a:ObjectID>
<a:Name>Association_10</a:Name>
<a:Code>association10</a:Code>
<a:CreationDate>1465832121</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832135</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,224={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,17=java.util.HashSet

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o61"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o57"/>
</c:Object2>
</o:Association>
<o:Association Id="o50">
<a:ObjectID>F1773534-A474-438F-82FE-7EF2CA435800</a:ObjectID>
<a:Name>Association_11</a:Name>
<a:Code>association11</a:Code>
<a:CreationDate>1465832150</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465832161</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:RoleAMultiplicity>1..1</a:RoleAMultiplicity>
<a:RoleBMultiplicity>0..*</a:RoleBMultiplicity>
<a:ExtendedAttributesText>{0DEDDB90-46E2-45A0-886E-411709DA0DC9},Java,224={72FA5C48-5524-4DF7-8187-ABB19AB5AF9E},roleAContainer,6=&lt;None&gt;
{F6FFC71C-C472-4261-A710-B0BCC0BF4D58},roleAImplementationClass,6=&lt;None&gt;
{C11C9F66-6453-43A2-8824-6654518CF65A},roleBImplementationClass,17=java.util.HashSet

</a:ExtendedAttributesText>
<c:Object1>
<o:Class Ref="o58"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o57"/>
</c:Object2>
</o:Association>
</c:Associations>
<c:Generalizations>
<o:Generalization Id="o9">
<a:ObjectID>3BD7D1C8-306B-4D9C-9B3C-948358C230BF</a:ObjectID>
<a:Name>Generalisation_1</a:Name>
<a:Code>Generalisation_1</a:Code>
<a:CreationDate>1465807799</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807799</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<c:Object1>
<o:Class Ref="o51"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o53"/>
</c:Object2>
</o:Generalization>
<o:Generalization Id="o12">
<a:ObjectID>5EE15AAC-9890-458A-BE0E-5F70D84B4934</a:ObjectID>
<a:Name>Generalisation_2</a:Name>
<a:Code>Generalisation_2</a:Code>
<a:CreationDate>1465807799</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465807799</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<c:Object1>
<o:Class Ref="o51"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o52"/>
</c:Object2>
</o:Generalization>
<o:Generalization Id="o16">
<a:ObjectID>73E29842-E927-4AE9-8955-3AE9E722E152</a:ObjectID>
<a:Name>Generalisation_3</a:Name>
<a:Code>Generalisation_3</a:Code>
<a:CreationDate>1465808205</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808205</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<c:Object1>
<o:Class Ref="o54"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o57"/>
</c:Object2>
</o:Generalization>
<o:Generalization Id="o19">
<a:ObjectID>2E00A93B-3DA2-4C23-A689-FE9CF517F5B8</a:ObjectID>
<a:Name>Generalisation_4</a:Name>
<a:Code>Generalisation_4</a:Code>
<a:CreationDate>1465808205</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808205</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<c:Object1>
<o:Class Ref="o54"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o56"/>
</c:Object2>
</o:Generalization>
<o:Generalization Id="o22">
<a:ObjectID>478A9175-3968-4A95-996D-A8E7FA46DF4E</a:ObjectID>
<a:Name>Generalisation_5</a:Name>
<a:Code>Generalisation_5</a:Code>
<a:CreationDate>1465808206</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465808206</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<c:Object1>
<o:Class Ref="o54"/>
</c:Object1>
<c:Object2>
<o:Class Ref="o55"/>
</c:Object2>
</o:Generalization>
</c:Generalizations>
<c:AssociationClassLinks>
<o:AssociationClassLink Id="o39">
<a:ObjectID>E60BD8D0-772A-4523-B538-76AF3343F63D</a:ObjectID>
<a:CreationDate>1465822110</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465822110</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<c:Object1>
<o:Class Ref="o58"/>
</c:Object1>
<c:Object2>
<o:Association Ref="o36"/>
</c:Object2>
</o:AssociationClassLink>
<o:AssociationClassLink Id="o44">
<a:ObjectID>F135DDEE-9442-437E-B0D0-DEFC4427268C</a:ObjectID>
<a:CreationDate>1465822173</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465822173</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<c:Object1>
<o:Class Ref="o61"/>
</c:Object1>
<c:Object2>
<o:Association Ref="o41"/>
</c:Object2>
</o:AssociationClassLink>
</c:AssociationClassLinks>
<c:TargetModels>
<o:TargetModel Id="o110">
<a:ObjectID>CB851478-1B35-4E75-AE5B-8A7A7AE8D1FD</a:ObjectID>
<a:Name>Java</a:Name>
<a:Code>Java</a:Code>
<a:CreationDate>1465805720</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465805720</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:TargetModelURL>file:///%_OBJLANG%/java5-j2ee14.xol</a:TargetModelURL>
<a:TargetModelID>0DEDDB90-46E2-45A0-886E-411709DA0DC9</a:TargetModelID>
<a:TargetModelClassID>1811206C-1A4B-11D1-83D9-444553540000</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o3"/>
</c:SessionShortcuts>
</o:TargetModel>
<o:TargetModel Id="o111">
<a:ObjectID>618E13C9-A59A-4EAC-8152-CDFA1033D4DF</a:ObjectID>
<a:Name>WSDL for Java</a:Name>
<a:Code>WSDLJava</a:Code>
<a:CreationDate>1465805720</a:CreationDate>
<a:Creator>INTI-0207</a:Creator>
<a:ModificationDate>1465805720</a:ModificationDate>
<a:Modifier>INTI-0207</a:Modifier>
<a:TargetModelURL>file:///%_XEM%/WSDLJ2EE.xem</a:TargetModelURL>
<a:TargetModelID>C8F5F7B2-CF9D-4E98-8301-959BB6E86C8A</a:TargetModelID>
<a:TargetModelClassID>186C8AC3-D3DC-11D3-881C-00508B03C75C</a:TargetModelClassID>
<c:SessionShortcuts>
<o:Shortcut Ref="o4"/>
</c:SessionShortcuts>
</o:TargetModel>
</c:TargetModels>
</o:Model>
</c:Children>
</o:RootObject>

</Model>