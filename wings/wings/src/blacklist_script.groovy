import groovy.json.JsonBuilder

def a = [
        "data": [
                "ProcessCode": "LIST_FORM",
                "Table_Name": "t_list",
                "List_Type": "BL_INDIVIDUALS",
                "Adding_Reason": "Welcome call",
                "Validity_Term": "2200-01-01",
                "User_Name": "tatiatataevi",
                "Action": "add",
                "List": []
        ]
]



def b =   [
        31704996860041,
        42507696060023,
        42412995410016,
        42712843930016,
        42002680060035,
        42503746360013,
        31205683470012,
        40805652560029,
        42601771560047,
        40201771420017,
        50912007350037,
        30610956730042,
        33010764250113,
        31701656920013,
        42407722330031,
        41801640223094,
        31403762720010,
        42203790590072,
        41907900500050,
        41810704310043,
        42301751220056,
        41905740570035,
        40208996900089,
        40207830570059,
        32703741230042,
        41905696670014,
        41905690590071,
        40402812680032,
        31002643420087,
        32004806010019,
        31109870580055,
        32907932360060,
        42501680170011,
        32905852420039,
        52705005040068,
        42612872600057,
        42907820540030,
        41009696070028,
        32606650660048,
        41803834220081,
        42712907190015,
        41002714300020,
        31604871140056,
        30711644040026,
        41211963120015,
        30602892950080,
        41411893900042,
        31105732130037,
        32510721840016,
        32310765540011,
        60112006820037,
        41807690540033,
        41402802180019,
        42807803070061,
        31206962400029,
        30907962400033,
        31109932410047,
        41401615950017

]


for (def i=0; i < b.size(); i++) {
    a.data.List.add("ID": b[i])
}
println new JsonBuilder(a).toPrettyString()


// ლისტის ტიპი
//  BL_INDIVIDUALS
//  BL_MOBILE_NUMBERS
//  BL_SMART_ID


//example
//import groovy.json.JsonBuilder
//
//def a = [
//        "data": [
//                "ProcessCode": "LIST_FORM",
//                "Table_Name": "t_list",
//                "List_Type": "BL_INDIVIDUALS",
//                "Adding_Reason": "Aggregator",
//                "Validity_Term": "2200-01-01",
//                "User_Name": "skalmakhelidze",
//                "Action": "add",
//                "List": []
//        ]
//]
//
//
//
//def b =   [ 30606934140075,
//            30202717150017,
//            40101727210027
//]
//
//
//for (def i=0; i < b.size(); i++) {
//    a.data.List.add("ID": b[i])
//}
//println new JsonBuilder(a).toPrettyString()

