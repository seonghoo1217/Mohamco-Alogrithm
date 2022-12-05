// 00:16:35
function solution(string) {
  let input = string.split("\n");
  const A = input[0].split("");
  const B = input[1].split(" ");
  let answer = [];
  A.forEach((word) => {
    if (B.includes(word)) {
      answer.push(word.toLowerCase());
    } else {
      answer.push(word);
    }
  });
  return answer.join("");
}
const string = `ABabC
A B D`;
console.log(solution(string));
