function solution(data) {
  let input = data.trim();

  const tags = input.match(/<[a-z ]+>/g) ?? [];
  const words = input.split(/<[a-z ]+>/);
  const reversedWords = words.map(word =>
    word
      .split(' ')
      .map(v => [...v].reverse().join(''))
      .join(' ')
  );

  const answer =
    tags.map((tag, i) => reversedWords[i] + tag).join('') +
    reversedWords[reversedWords.length - 1];
  return answer;
}

const case1 = `baekjoon online judge`;
const case2 = `<open>tag<close>`;
const case3 = `<ab cd>ef gh<ij kl>`;

console.log(solution(case1));
console.log(solution(case2));
console.log(solution(case3));
