// 01:40:20
function solution(word, input) {
  const keyword = word;
  let start = input;
  let answer = 0;

  for (let i = 0; i < keyword.length; i++) {
    answer += Math.abs(keyword.charCodeAt(i) - start.charCodeAt(0));
    start = keyword[i];
  }

  return answer;
}

const word = "ILOVEYONSEI"
const input = `A`;

console.log(solution(word, input));