//https://stackoverflow.com/questions/30512744/count-repeated-letters-in-a-string
function CountCharacter(str){
   let result={};
   for(let abc of str){
    result[abc] = result.hasOwnProperty(abc)?result[abc]+1:1
   }
   
   console.log(result)


}

CountCharacter("pranav")

function CountCharacter1(str){
    let result={};
    let repeats=[];
   for(let abc of str){
    result[abc] = result.hasOwnProperty(abc)?result[abc]+1:1
   }
   
   console.log(result)
  for(let key in result){
    if(result.hasOwnProperty(key)){
        repeats.push(new Array(result[key]+1).join(key))
    }
  }
  console.log(repeats);  
 }
 
 CountCharacter1("pranav")





