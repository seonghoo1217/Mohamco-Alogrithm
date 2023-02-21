//00:30:50
function solution(case1) {
  const input = case1.trim();
  return input.replace(/<[a-z0-9 ]+>|[a-z0-9]+/g, (match) => {
    if (match.startsWith("<")) {
      return match;
    }
    return [...match].reverse().join("");
  });
}

const case1 = `<open>tag<close>`;

console.log(solution(case1));
