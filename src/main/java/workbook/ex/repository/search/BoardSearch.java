package workbook.ex.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import workbook.ex.domain.Board;
import workbook.ex.dto.BoardListAllDTO;
import workbook.ex.dto.BoardListReplyCountDTO;

public interface BoardSearch {

    Page<Board> search1(Pageable pageable);

    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);

    Page<BoardListReplyCountDTO> searchWithReplyCount(String[] types, String keyword, Pageable pageable);

    Page<BoardListAllDTO> searchWithAll(String[] types, String keyword, Pageable pageable);
}
